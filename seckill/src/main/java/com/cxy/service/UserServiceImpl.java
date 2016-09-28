package com.cxy.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cxy.dao.UserDao;
import com.cxy.entity.User;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	

}
