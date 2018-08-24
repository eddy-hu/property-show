package com.jessienwei.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

import com.jessienwei.web.dto.HouseDTO;
import com.jessienwei.web.dto.UserDTO;
import com.jessienwei.web.exception.ResourceNotFoundException;
import com.jessienwei.web.repository.HouseRepository;
import com.jessienwei.web.repository.UserRepository;


@RestController
@RequestMapping(path="/house")
@CrossOrigin(origins = "http://localhost:4200")
public class HouseController {

    @Autowired
    private HouseRepository houseRepository;

    // Get All houses
    @GetMapping(path="/all")
    public List<HouseDTO> getAllHouses() {
        return houseRepository.findAll();
    }
    // Create a new house
    @PostMapping(path="/add")
    public HouseDTO addHouse(@Valid @RequestBody HouseDTO house) {
		return houseRepository.save(house);
    }
    // Get a Single house
    @GetMapping(path="/{id}")
    public HouseDTO getHouseById(@PathVariable(value = "id") Long houseId) {
        return houseRepository.findById(houseId).orElseThrow(() -> new ResourceNotFoundException("House", "id", houseId));
    }
    // Update a house
    @PutMapping(path="/update/{id}")
    public HouseDTO updateHouse(@PathVariable(value = "id") Long houseId, @Valid @RequestBody HouseDTO houseDetails) {

    	HouseDTO house = houseRepository.findById(houseId).orElseThrow(() -> new ResourceNotFoundException("House", "id", houseId));

    	house.setHouseName(houseDetails.getHouseName());
    	house.setTypeId(houseDetails.getTypeId());
    	house.setAreaId(houseDetails.getAreaId());
    	house.setStreet(houseDetails.getStreet());
    	house.setCity(houseDetails.getCity());
    	house.setPostCode(houseDetails.getPostCode());
    	house.setCountry(houseDetails.getCountry());
    	house.setPrice(houseDetails.getPrice());
    	house.setSize(houseDetails.getSize());
    	house.setRooms(houseDetails.getRooms());
    	house.setBathRooms(houseDetails.getBathRooms());
    	house.setGarages(houseDetails.getGarages());
    	house.setAvailableDate(houseDetails.getAvailableDate());
    	house.setBasement(houseDetails.getBasement());
    	house.setAc(houseDetails.getAc());
    	house.setGasHeat(houseDetails.getGasHeat());
    	house.setFencedYard(houseDetails.getFencedYard());
    	house.setWasherDryer(houseDetails.getWasherDryer());
    	house.setDeck(houseDetails.getDeck());
    	house.setBalcony(houseDetails.getBalcony());
    	house.setStorage(houseDetails.getStorage());    	
    	house.setIntroduction(houseDetails.getIntroduction());
    	
        HouseDTO updatedHouse = houseRepository.save(house);
        return updatedHouse;
        
        
    }
    // Delete a house
    @DeleteMapping(path="/delete/{id}")
    public ResponseEntity<?> deleteHouse(@PathVariable(value = "id") Long houseId) {
    	HouseDTO house = houseRepository.findById(houseId).orElseThrow(() -> new ResourceNotFoundException("House", "id", houseId));

    	houseRepository.delete(house);

        return ResponseEntity.ok().build();
    }
}
