package com.ssm.mybatis.pojo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ssm.mybatis.mapper.UserMapper;

public class MyBatisTest {
	
	@Test
	public void test(){
		String resource = "sqlMapConfig.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			System.out.println(in);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			UserMapper mapper = sqlSession.getMapper(UserMapper.class);
			
//			id 查询
//			User user = mapper.findUserById(1);

//			name 模糊查询
//			List<User> users = mapper.findUserByName("明");
//			for (User user : users) {
//				System.out.println(user);
//			}
			
//			插入数据
//			User user = new User();
//			user.setUsername("灰原");
//			user.setSex("0");
//			user.setBirthday(new Date());
//			user.setAddress("东京");
//			mapper.insetUser(user);
//			sqlSession.commit();
//			System.out.println(user.getId());
			
//			更新数据
//			User user = new User();
//			user.setId(8);
//			user.setUsername("灰原");
//			user.setSex("1");
//			user.setBirthday(new Date());
//			user.setAddress("东京");
//			mapper.updateUser(user);
//			sqlSession.commit();
			
			mapper.deleteUser(4);
			sqlSession.commit();
			
			
			sqlSession.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
