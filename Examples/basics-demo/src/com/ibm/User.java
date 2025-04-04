package com.ibm;

public class User {
	int id; // fields
	String name; // fields
	static int counter = 5;
	
	/*
	 * If a class doesn't have a constructor compiler creates default constructor i.e., User()
	 * If a class have a constructor then compiler doesn't create default constructor, but retains the constructors
	 * present in the class
	 */
	User(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("User(2) constructor");
	}
	// a method to display id & name
	void display() {
		System.out.println("Id = "+id+", Name = "+name+", Counter = "+counter);
	}
}
