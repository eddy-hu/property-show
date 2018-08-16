package com.jessienwei.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jessienwei.web.dto.UserDTO;
import com.jessienwei.web.repository.UserRepository;

@Service("userService")
public class UserService {

	private UserRepository userRepository;
	
    @Autowired
    public UserService(UserRepository userRepository) { 
      this.userRepository = userRepository;
    }
    
	public UserDTO findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
		
	public void saveUser(UserDTO user) {
		userRepository.save(user);
	}

}