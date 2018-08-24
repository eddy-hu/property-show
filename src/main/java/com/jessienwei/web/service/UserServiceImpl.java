package com.jessienwei.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jessienwei.web.dto.RoleDTO;
import com.jessienwei.web.dto.UserDTO;
import com.jessienwei.web.repository.RoleRepository;
import com.jessienwei.web.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private RoleRepository roleRepository;
	
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
    @Override
	public UserDTO findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(UserDTO user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        RoleDTO role = roleRepository.findByType("USER");
        user.setRole(role);
		userRepository.save(user);
	}

}