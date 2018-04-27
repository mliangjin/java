package com.learn.ssm.chapter3.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;

public class SqlSessionFactoryUtils {
	
	private final static Class<SqlSessionFactoryUtils> LOCK = SqlSessionFactoryUtils.class;
	private static SqlSessionFactory sqlSessionFactory = null;
	
	private SqlSessionFactoryUtils() {};
	
	private static SqlSessionFactory getSqlSessionFactory() {
		synchronized (LOCK) {
			if (sqlSessionFactory != null) {
				return sqlSessionFactory;
			}
			
			InputStream inputStream;
			String resource = "mybatis-config.xml";
			
			try {
				inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}
	
	public static SqlSession getSqlSession() {
		if (sqlSessionFactory == null) {
			getSqlSessionFactory();
		}
		return sqlSessionFactory.openSession();
	}
	
	/*
	 * 不推荐的方法
		public static SqlSessionFactory getSqlSessionFactory2() {
			synchronized (LOCK) {
				PooledDataSource dataSource = new PooledDataSource();
				dataSource.setDriver("com.mysql.jdbc.Driver");
				dataSource.setUsername("root");
				dataSource.setPassword("123456");
				dataSource.setUrl("jdbc:mysql://localhost:3306/chapter3");
				dataSource.setDefaultAutoCommit(false);
				
				TransactionFactory transactionFactory = new JdbcTransactionFactory();
				Environment environment = new Environment("development", transactionFactory, dataSource);
				
				Configuration configuration = new Configuration(environment);
				   
				configuration.getTypeAliasRegistry().registerAlias("role", Role.class);
	   
				configuration.addMapper(RoleMapper.class);
				configuration.addMapper(RoleMapper2.class);
				
				sqlSessionFactory = 
				    new SqlSessionFactoryBuilder().build(configuration);
				return sqlSessionFactory; 	
			}
		}
	*/
}
