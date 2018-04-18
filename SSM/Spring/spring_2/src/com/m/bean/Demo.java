package com.m.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m.bean.User;
import com.m.service.UserService;
import com.m.service.UserServiceImpl;

public class Demo {
	
	@Test
	public void fun1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService) ac.getBean("userService");
		
		userService.save();
	}
}
