package com.ibm;

public class Greetings {
	public String welcome(String name) {
		return "Welcome "+name;
	}
	public String welcomeUpperCase(String name) {
		return "WELCOME "+name.toUpperCase();
	}
	//a method that returns true or false for even numbers
	public boolean isEven(int num) {
		if(num <= 0) {
			throw new RuntimeException("Number must not be 0 or -ve");
		}
		return num % 2 == 0;
	}
}	
