package com.rohan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.stereotype.Controller;

import com.rohan.model.User;
import com.rohan.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	public String saveUser(User user) {
		return userService.saveUser(user);
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
