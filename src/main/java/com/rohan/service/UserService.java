package com.rohan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohan.repository.UserRepository;
import com.rohan.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public String saveUser(User user) {
		String id = userRepository.saveUser(user);
		return id;
	}
	
}
