package com.jessienwei.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.jessienwei.web.dto.TypeDTO;
import com.jessienwei.web.exception.ResourceNotFoundException;
import com.jessienwei.web.repository.TypeRepository;

@RestController
@RequestMapping(path = "/type")
public class TypeController {

	@Autowired
	private TypeRepository typeRepository;


	//Get All types
	@GetMapping(path = "/all")
	public List<TypeDTO> getAllTypes(){
		return typeRepository.findAll();
	}
	
	//Create a new Type (maybe it can be created with a array rather than one by one)
	@PostMapping(path = "/add")
	public TypeDTO addType(@Valid @RequestBody TypeDTO type){
		return typeRepository.save(type);
	}

	//Get a Single Type
	@GetMapping(path = "/{id}")
	public TypeDTO getTypeById(@PathVariable(value = "id")Long typeId){
		return typeRepository.findById(typeId).orElseThrow(() -> new ResourceNotFoundException("Type", "id", typeId));
	}

	//Update a type
	@PutMapping(path = "/update/{id}")
	public TypeDTO updateType(@PathVariable(value = "id")Long typeId, @Valid @RequestBody TypeDTO typeDetails){

		TypeDTO type = typeRepository.findById(typeId).orElseThrow(() -> new ResourceNotFoundException("Type", "id", typeId));
		type.setType_name(typeDetails.getType_name());

		TypeDTO updateType = typeRepository.save(type);

		return updateType;
	}

	//Delete a type
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<?> deleteType(@PathVariable(value = "id")Long typeId){

		TypeDTO type = typeRepository.findById(typeId).orElseThrow(() -> new ResourceNotFoundException("Type", "id", typeId));
		typeRepository.deleteById(typeId);

		return ResponseEntity.ok().build();

	}
}
