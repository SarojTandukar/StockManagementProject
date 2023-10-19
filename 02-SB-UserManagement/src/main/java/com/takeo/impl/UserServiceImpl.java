package com.takeo.impl;

import org.springframework.stereotype.Service;

import com.takeo.model.User;
import com.takeo.repo.UserRepo;

import lombok.Data;
@Data
@Service
public class UserServiceImpl {

	private UserRepo userRepo;
	
	public User createUser(User user) {
		User createdUser = userRepo.save(user);
		return createdUser;
	}
	
	
}
