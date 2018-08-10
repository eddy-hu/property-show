package com.jessienwei.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessienwei.web.dto.ImageDTO;

public interface ImageRepository extends JpaRepository<ImageDTO, Long> {

}
