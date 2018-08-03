package com.jessienwei.web.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.jessienwei.web.dto.AreaDTO;
import com.jessienwei.web.exception.ResourceNotFoundException;
import com.jessienwei.web.repository.AreaRepository;

@RestController
@RequestMapping(path = "/area")
public class AreaController {


	@Autowired
	private  AreaRepository areaRepository;


	//Get all areas
	@GetMapping(path = "/all")
	public List<AreaDTO> getAllAreas(){
		return areaRepository.findAll();
	}

	//Create a area
	@PostMapping(path = "/add")
	public AreaDTO createArea(@Valid @RequestBody AreaDTO area){
		/*for(AreaDTO area : areas)
			areaRepository.save(area);

		return ResponseEntity.ok().build();*/
		return areaRepository.save(area);
	}

	//Get a single area by id
	@GetMapping(path = "/{id}")
	public AreaDTO getSingleArea(@PathVariable(value = "id") Long area_id){
		return areaRepository.findById(area_id).orElseThrow(() -> new ResourceNotFoundException("Area","area_id", area_id));
	}

	//Update a area
	@PutMapping(path = "/update/{id}")
	public AreaDTO updateArea(@PathVariable(value = "id")Long area_id, @Valid @RequestBody AreaDTO areaDetail ){
		AreaDTO area = areaRepository.findById(area_id).orElseThrow(() -> new ResourceNotFoundException("Area", "area_id", area_id));
		area.setArea_name(areaDetail.getArea_name());
		return areaRepository.save(area);
	}

	//Delete a area
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<?> deleteArea(@PathVariable(value = "id") Long area_id){
		 AreaDTO area = areaRepository.findById(area_id).orElseThrow(() -> new ResourceNotFoundException("Area","area_id", area_id));
		 areaRepository.delete(area);

		 return ResponseEntity.ok().build();

	}












}
