package com.ssm.spring.aop.impl.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// 创建 IOC 容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-XML.xml");
		
		// 从 IOC 容器中获取 bean 实例
		ArithmeticCalculator arithmeticCalculator = ctx.getBean(ArithmeticCalculator.class);
		
		/// 使用bean 
		int result = arithmeticCalculator.add(6, 3);
		System.out.println(result);
		
		int result2 = arithmeticCalculator.div(80, 20);
		System.out.println(result2);
	}

}
