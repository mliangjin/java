package com.m.bean;

public class User {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void init() {
		System.out.println("初始化方法执行");
	}
	public void destroy() {
		System.out.println("销毁方法");
	}
}
