package com.rohan.repository;
import org.springframework.stereotype.Repository;

import com.rohan.model.User;

@Repository
public class UserRepository {
	
	public String saveUser(User user) {
		System.out.println("User Saved");
		return "1";
	}
	
	public User getUser(int userId) {
		return new User();
	}

}
