package com.study.mapper;

import com.study.domain.User;

public class UserMapperImpl implements UserMapper {

	@Override
	public User queryUserById(Integer id) {
		
		User user=null;
		switch (id) {
		case 1:
			user=new User(id, "老周", "日本");
			break;
		case 2:
			user=new User(id, "老唐", "**");
			break;
		}
		return user;
	}

}
