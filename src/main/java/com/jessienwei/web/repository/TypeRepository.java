package com.jessienwei.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessienwei.web.dto.TypeDTO;

public interface TypeRepository extends JpaRepository<TypeDTO, Long> {

}
