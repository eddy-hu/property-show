package com.jessienwei.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.jessienwei.web.dto.HouseDTO;


@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface HouseRepository extends JpaRepository<HouseDTO, Long> {

}