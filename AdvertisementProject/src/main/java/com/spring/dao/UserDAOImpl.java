package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.User;

public class UserDAOImpl implements UserDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public User register(User user) {
		hibernateTemplate.save(user);
		return user;
	}

}
