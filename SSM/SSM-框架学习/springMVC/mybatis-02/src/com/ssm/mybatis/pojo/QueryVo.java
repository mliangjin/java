package com.ssm.mybatis.pojo;

import java.io.Serializable;

// 包装类

public class QueryVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
