package com.m.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// <bean name="user" class="com.m.bean.User" />
@Component("user")
//	@Service	// service层
//	@Controller // web层
//	@Repository // dao层

// 指定对象的作用范围
@Scope(scopeName="singleton")
public class User {
//	@Value("明日香") 		// 通过反转的Field赋值，破坏封装性
	private String name;
	private int age;
	
	// 问题如果匹配到多个类型一致的对象，将无法选择注入那个对象
	// @Autowired			// 自动装配
	// @Qualifier("car")
	// 推荐使用这种，一次性搞定注入
	@Resource(name="car")	
	private TestObjectCar car;
	
	@PostConstruct	// 对象创建后调用 init-method
	public void init() {
		System.out.println("初始化方法执行");
	}
	@PreDestroy		// 对象销毁前调用	destroy-method
	public void destroy() {
		System.out.println("销毁方法");
	}
	
	
	@Value("明日")		// 通过set方法赋值，推荐使用
	public void setName(String name) {
		this.name = name;
	}
	public TestObjectCar getCar() {
		return car;
	}
	public void setCar(TestObjectCar car) {
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car.name + car.color + "]";
	}
}
