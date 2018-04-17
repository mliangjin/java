package com.m.bean;

import com.m.a_hello.TestObjectCar;

public class User {
	private String name;
	private int age;
	private TestObjectCar car;
	public TestObjectCar getCar() {
		return car;
	}
	public void setCar(TestObjectCar car) {
		this.car = car;
	}
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
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car.name + car.color + "]";
	}
}
