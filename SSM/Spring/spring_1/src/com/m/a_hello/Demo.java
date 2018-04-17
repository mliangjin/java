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
		System.out.println("配置文件中的name属性："+u.getName());
		System.out.println("配置文件中的age属性："+u.getAge());
		
		// 5 复杂对象
		ComplexObjectInject complex = (ComplexObjectInject) ac.getBean("complex");
		System.out.println(complex);
	}
}
