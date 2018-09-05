package com.peter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.peter.dao.UserDao;
import com.peter.entity.User;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public List<User> getAllUsers(){
		return userDao.queryUserByPage("", "", "", 0, 10);
	}
	
}
