package com.m.service;

public class UserServiceImpl implements UserService{

	@Override
	public void save() {
		System.out.println("保存用户方法");
	}

	@Override
	public void delete() {
		System.out.println("删除用户方法");
	}

	@Override
	public void update() {
		System.out.println("更新数据方法");
	}

	@Override
	public void find() {
		System.out.println("查找数据方法");
	}
	
}
