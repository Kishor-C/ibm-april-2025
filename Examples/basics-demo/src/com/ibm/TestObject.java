package com.ibm;

public class TestObject {
	public static void main(String[] args) {
		// user1 & user2 are not object, they are the reference varaibles for an object
		User user1 = new User(200, "Raj"); // id=200, name=Raj
		User user2 = new User(300, "Atharv"); // id=300, name=Atharv
//		user1.id = 200; // user1.id = 200, user1.name = null;
//		user2.id = 300; // user2.id = 300, user2.name = null;
//		user1.name = "Atharv"; // user1.id = 200, user1.name = Atharv
//		user2.name = "Siddharth";// user2.id = 300, user2.name = Siddharth
		user1.display();
		user2.display();
	}
}
