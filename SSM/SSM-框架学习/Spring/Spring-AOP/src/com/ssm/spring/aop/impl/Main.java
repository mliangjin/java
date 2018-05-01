package com.ssm.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// 创建 IOC 容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 从 IOC 容器中获取 bean 实例
		ArithmeticCalculator arithmeticCalculator = ctx.getBean(ArithmeticCalculator.class);
		
		/// 使用bean 
		int result = arithmeticCalculator.add(2, 3);
		System.out.println(result);
		
		int result2 = arithmeticCalculator.div(100, 20);
		System.out.println(result2);
	}

}
