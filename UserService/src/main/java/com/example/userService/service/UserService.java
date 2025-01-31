package com.example.userService.service;

import java.util.List;

import com.example.userService.entities.User;

public interface UserService {

	
	User saveUser(User user);
	// get all the user 
	List<User> getAllUser();
	
	//get single user of given id 
	User getUserById(String userId);
	//delete 
	//update
	
}
