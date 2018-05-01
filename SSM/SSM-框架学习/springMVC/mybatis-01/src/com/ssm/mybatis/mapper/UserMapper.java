package com.ssm.mybatis.mapper;

import java.util.List;

import com.ssm.mybatis.pojo.User;

public interface UserMapper {
	
	public User findUserById(Integer id);
	
	public List<User> findUserByName(String username);
	
	public void insetUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(Integer id);
}
