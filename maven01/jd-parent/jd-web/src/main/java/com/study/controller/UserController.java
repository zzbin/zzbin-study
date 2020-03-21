package com.study.controller;

import com.study.domain.User;
import com.study.service.UserService;
import com.study.service.impl.UserServiceImpl;

public class UserController {

	private UserService userService=new UserServiceImpl();
	
	public void loadUserById(Integer id) {
		User user = userService.queryUserById(id);
		System.out.println(user);
	}

}
