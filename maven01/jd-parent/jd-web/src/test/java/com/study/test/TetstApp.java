package com.study.test;

import com.study.controller.UserController;

public class TetstApp {
	
	public static void main(String[] args) {
		UserController controller=new UserController();
		controller.loadUserById(1);
	}

}
