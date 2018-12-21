package com.neuedu.bm.service;

import com.neuedu.bm.dao.UserDao;
import com.neuedu.bm.entity.User;

public class UserService {
	
	private UserDao userDao = new UserDao();
	
	public User validate(String username, String password) {
		// TODO Auto-generated method stub
		User principal = new User();
		principal.setUsername(username);
		principal.setPassword(password);
		return userDao.findOne(principal);
	}
	
}
