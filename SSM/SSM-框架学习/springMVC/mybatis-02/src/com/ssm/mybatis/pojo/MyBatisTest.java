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
			
			
//			QueryVo 测试
//			QueryVo vo = new QueryVo();
//			User user = new User();
//			user.setUsername("两");
//			vo.setUser(user);
//			List<User> list = mapper.findUserByQueryVo(vo);
//			for(User li : list) {
//				System.out.println(li);
//			}
			
			Integer countUser = mapper.countUser();
			System.out.println(countUser);
			
			
			sqlSession.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
