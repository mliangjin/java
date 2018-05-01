package com.ssm.mybatis.mapper;

import com.ssm.mybatis.pojo.User;

public interface UserMapper {
	public User findUserById(Integer id);
}
