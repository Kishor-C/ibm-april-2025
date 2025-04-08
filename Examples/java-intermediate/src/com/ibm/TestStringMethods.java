package com.ibm;

public class TestStringMethods {
	public static void main(String[] args) {
		String s1, s2, s3, s4;
		s1 = "hello";
		s2 = "hello";
		s3 = new String("hello");
		s4 = new String("hello");
		System.out.println("s1 == s2: "+(s1 == s2)+", s1 == s3: "+(s1 == s3));
		System.out.println("s1 equals s2: "+s1.equals(s2)+", s3 equals s4: "+s3.equals(s4));
		System.out.println(s1.concat("123")); // hello123
		System.out.println(s1); // hello
		s1 = s1.concat("890");
		System.out.println("s1 = "+s1); // hello890
		// split method can split a string into multiple strings and stores in an array 
		String text = "Raj;Rahul;Ravi;Vishnu";
		String[] splitter = text.split(";"); // splitter = {Raj, Rahul, Ravi, Vishnu};
		for(String str : splitter) {
			System.out.println(str);
		}
	}
}
