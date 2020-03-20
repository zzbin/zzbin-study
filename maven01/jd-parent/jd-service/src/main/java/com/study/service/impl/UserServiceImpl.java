package com.study.service.impl;

import com.study.domain.User;
import com.study.mapper.UserMapper;
import com.study.mapper.UserMapperImpl;
import com.study.service.UserService;

public class UserServiceImpl  implements UserService {
	
	private UserMapper userMapper=new UserMapperImpl();

	@Override
	public User queryUserById(Integer id) {
		return userMapper.queryUserById(id);
	}

}
