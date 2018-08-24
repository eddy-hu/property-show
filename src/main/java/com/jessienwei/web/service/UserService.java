package com.jessienwei.web.service;

import com.jessienwei.web.dto.UserDTO;

public interface UserService {
	public UserDTO findUserByEmail(String email);
	public void saveUser(UserDTO user);
}
