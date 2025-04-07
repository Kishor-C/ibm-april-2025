package com.ibm;

public class TestEncapsulation {
	public static void main(String[] args) {
		User user1 = new User(12345, "Raj");
		System.out.println("Hello "+user1.getName()+" your id is "+user1.getUserId());
		user1.setName("Rajesh");
		System.out.println("Your name is updated to "+user1.getName());
		/*
		 * Note: getter method returns the data and S.o.p is printing the data getter returns
		 * you can write the getter by assigning the data to some variable
		 * ex: 
		 * int id = user1.getUserId();
		 */
		User user2 = new User(4567, "Vijay");
		System.out.println(user1);
		System.out.println(user2);
		/*
		 * 
		 * toString() is automatically called when you print the object, most of the classes
		 * override toString to represent the object details 
		 */
	}
}
