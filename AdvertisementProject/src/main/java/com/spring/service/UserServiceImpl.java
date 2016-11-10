package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.AdvertiseDAO;
import com.spring.entity.User;

public class UserServiceImpl implements UserService {

	@Autowired
	private AdvertiseDAO advertiseDao;

	public User register(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
