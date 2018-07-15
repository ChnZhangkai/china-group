package com.china.group.model;

public class User {

	private String id;

	private String username;

	private String age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "TestVo [id=" + id + ", username=" + username + ", age=" + age + "]";
	}

}
