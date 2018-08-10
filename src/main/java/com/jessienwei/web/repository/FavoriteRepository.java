package com.jessienwei.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessienwei.web.dto.FavoriteDTO;

public interface FavoriteRepository extends JpaRepository<FavoriteDTO, Long> {

}
