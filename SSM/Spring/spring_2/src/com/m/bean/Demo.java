package com.m.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m.bean.User;

public class Demo {
	
	@Test
	public void fun1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		User u = (User) ac.getBean("user");
		System.out.println(u);
		
		System.out.println(ac);
	}
}
