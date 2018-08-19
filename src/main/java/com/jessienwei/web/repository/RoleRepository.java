package com.jessienwei.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessienwei.web.dto.RoleDTO;

public interface RoleRepository extends JpaRepository<RoleDTO, Long> {

}
