package com.jessienwei.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jessienwei.web.dto.FavoriteDTO;
import com.jessienwei.web.exception.ResourceNotFoundException;
import com.jessienwei.web.repository.FavoriteRepository;

@RestController
@RequestMapping(path = "/favorite")
public class FavoriteController {

	@Autowired
	private FavoriteRepository favoriteRepository;


	//Get All Favorites
	@GetMapping(path = "/all")
	public List<FavoriteDTO> getAllFavorites(){
		return favoriteRepository.findAll();
	}
	
	//Create a Favorite
	@PostMapping(path = "/add")
	public FavoriteDTO addFavorite(@Valid @RequestBody FavoriteDTO favorite){
		return favoriteRepository.save(favorite);
	}

	//Get a Single Favorite
	@GetMapping(path = "/{user_id}")
	public FavoriteDTO getFavoriteByUserId(@PathVariable(value = "user_id")Long user_id){
		return favoriteRepository.findById(user_id).orElseThrow(() -> new ResourceNotFoundException("Favorite", "user_id", user_id));
	}

	//Update a Favorite
	@PutMapping(path = "/update/{user_id}")
	public FavoriteDTO updateType(@PathVariable(value = "user_id")Long user_id, @Valid @RequestBody FavoriteDTO favoriteDetails){

		FavoriteDTO favorite = favoriteRepository.findById(user_id).orElseThrow(() -> new ResourceNotFoundException("Favorite", "user_id", user_id));
		favorite.setHouse_id(favoriteDetails.getHouse_id());

		FavoriteDTO updatedFavorite = favoriteRepository.save(favorite);

		return updatedFavorite;
	}

	//Delete a Favorite
	@DeleteMapping(path = "/delete/{user_id}")
	public ResponseEntity<?> deleteType(@PathVariable(value = "user_id")Long user_id){

		FavoriteDTO favorite = favoriteRepository.findById(user_id).orElseThrow(() -> new ResourceNotFoundException("Favorite", "user_id", user_id));
		favoriteRepository.deleteById(user_id);

		return ResponseEntity.ok().build();

	}
}
