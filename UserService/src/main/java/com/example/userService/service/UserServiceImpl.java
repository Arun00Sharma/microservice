package com.example.userService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userService.entities.User;
import com.example.userService.exception.ResourceNotFoundException;
import com.example.userService.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {

        String randomUserId= UUID.randomUUID().toString(); 
        user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException());
	}

}
