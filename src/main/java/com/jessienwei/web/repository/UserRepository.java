package com.jessienwei.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jessienwei.web.dto.UserDTO;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Long> {

	UserDTO findByEmail(String email);
}