package com.m.a_hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m.bean.User;

public class Demo {
	
	@Test
	public void fun1() {
		// 1 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2 向容器'要'，user对象
		User u = (User) ac.getBean("user");
		// 3 打印user对象
		System.out.println(u);
		// 4 打印配置文件中注入的参数
		System.out.println(u.getName());
		System.out.println(u.getAge());
	}
}
