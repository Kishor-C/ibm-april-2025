package com.ibm;

public class Datasource {
	
	private String username;
	private String password;
	
	public Datasource() {
		System.out.println("Datasource object created");
	}

	public Datasource(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		System.out.println("Datasource(username,password) object created");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		System.out.println("setUsername:"+username);
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setPassword:"+password);
		this.password = password;
	}
	
	
}
