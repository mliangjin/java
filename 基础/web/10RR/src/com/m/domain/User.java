package com.m.domain;

public class User {

//`id` int(11) NOT NULL AUTO_INCREMENT,
//  `username` varchar(20) DEFAULT '',
//  `password` varchar(20) DEFAULT NULL,
//  `name` varchar(20) DEFAULT NULL,
//  `email` varchar(20) DEFAULT NULL,
//  `sex` varchar(5) DEFAULT NULL,
//  `hobby` varchar(50) DEFAULT NULL,
//  `birthday` date DEFAULT NULL,
//  PRIMARY KEY (`id`)
		
		private int id;
		private String username;
		private String password;
		
		private String name;
		private String email;
		private String sex;
		
		private String hobby;
		private String birthday;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getHobby() {
			return hobby;
		}
		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}


}
