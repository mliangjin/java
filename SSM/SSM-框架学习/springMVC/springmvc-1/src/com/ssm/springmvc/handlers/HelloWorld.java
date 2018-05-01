package com.ssm.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.springmvc.entities.User;

@Controller
public class HelloWorld {
	
	@RequestMapping("/testPojo")
	public String testPojo(User user) {
		System.out.println("testPojo" + user);
		return "success";
	}
	
	@RequestMapping("/pathVariable/{id}")
	public String pathVariable(@PathVariable("id") Integer id) {
		System.out.println(id);
		return "success";
	}
	
	@RequestMapping("/helloworld")
	public String hello() {
		System.out.println("hello world");
		return "success";
	}
}
