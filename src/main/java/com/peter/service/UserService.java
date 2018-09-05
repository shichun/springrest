package com.peter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.peter.entity.User;

@Service
public interface UserService {
	
	public List<User> getAllUsers();
	
	
}
