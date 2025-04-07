package com.ibm;

public class User {
	private int userId;
	private String name;
	public User(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
}
