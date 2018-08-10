package com.jessienwei.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jessienwei.web.dto.HouseDTO;


@Repository
public interface HouseRepository extends JpaRepository<HouseDTO, Long> {

}