package com.ssm.springmvc.entities;

public class User {
	private String username;
	private String password;
	private Integer age;
	private String email;
	private Address address;
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", age=" + age + ", email=" + email
				+ ", address=" + address + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
