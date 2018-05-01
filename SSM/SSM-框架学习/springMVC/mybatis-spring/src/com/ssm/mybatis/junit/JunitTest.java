package com.ssm.mybatis.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.mybatis.mapper.UserMapper;
import com.ssm.mybatis.pojo.User;

public class JunitTest {
	@Test
	public void testMapper() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = ac.getBean(UserMapper.class);
		User user = userMapper.findUserById(3);
		System.out.println(user);
	}
}
