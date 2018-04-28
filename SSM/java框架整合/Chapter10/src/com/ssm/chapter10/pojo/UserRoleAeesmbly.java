package com.ssm.chapter10.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserRoleAeesmbly {
	private Long id;
	private List<Role> list;
	private Map<Role, User> map;
	private Set<Role> set;
	
	public Set<Role> getSet() {
		return set;
	}
	public void setSet(Set<Role> set) {
		this.set = set;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Role> getList() {
		return list;
	}
	public void setList(List<Role> list) {
		this.list = list;
	}
	public Map<Role, User> getMap() {
		return map;
	}
	public void setMap(Map<Role, User> map) {
		this.map = map;
	}
	
	
}
