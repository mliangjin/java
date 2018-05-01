package com.ssm.mybatis.mapper;

import java.util.List;

import com.ssm.mybatis.pojo.QueryVo;
import com.ssm.mybatis.pojo.User;

public interface UserMapper {
	
	public User findUserById(Integer id);
	
	public List<User> findUserByQueryVo (QueryVo vo);
	
	public Integer countUser();
	
	public List<User> selectUserBySexAndUsername(User user);
}
