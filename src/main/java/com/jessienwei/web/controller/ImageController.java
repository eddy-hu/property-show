package com.jessienwei.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.jessienwei.web.dto.ImageDTO;
import com.jessienwei.web.exception.ResourceNotFoundException;
import com.jessienwei.web.repository.ImageRepository;

@RestController
@RequestMapping(path = "/image")
public class ImageController {

	@Autowired
	private ImageRepository ImageRepository;


	//Get All images
	@GetMapping(path = "/all")
	public List<ImageDTO> getAllTypes(){
		return ImageRepository.findAll();
	}
	
	//Create a new image 
	@PostMapping(path = "/add")
	public ImageDTO addImage(@Valid @RequestBody ImageDTO image){
		return ImageRepository.save(image);
	}

	//Get a Single Image
	@GetMapping(path = "/{house_id}")
	public ImageDTO getImageByHouseId(@PathVariable(value = "house_id")Long house_id){
		return ImageRepository.findById(house_id).orElseThrow(() -> new ResourceNotFoundException("Image", "house_id", house_id));
	}

	//Update a Image
	@PutMapping(path = "/update/{house_id}")
	public ImageDTO updateImage(@PathVariable(value = "house_id")Long house_id, @Valid @RequestBody ImageDTO imageDetails){

		ImageDTO image = ImageRepository.findById(house_id).orElseThrow(() -> new ResourceNotFoundException("Image", "house_id", house_id));
		image.setImage_name(imageDetails.getImage_name());
		image.setImage_path(imageDetails.getImage_path());

		ImageDTO updatedImage = ImageRepository.save(image);

		return updatedImage;
	}

	//Delete a Image
	@DeleteMapping(path = "/delete/{house_id}")
	public ResponseEntity<?> deleteType(@PathVariable(value = "house_id")Long house_id){

		ImageDTO image = ImageRepository.findById(house_id).orElseThrow(() -> new ResourceNotFoundException("Image", "house_id", house_id));
		ImageRepository.deleteById(house_id);

		return ResponseEntity.ok().build();

	}
}
