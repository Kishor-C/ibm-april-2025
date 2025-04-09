package com.ibm;


sealed class X permits Y, Z, I { } 

non-sealed class Y extends X { } 

final class Z extends X { } 

sealed class I extends X permits D {}

final class D extends I  { } 


public class TestJavaNewFeatures {
	public static void main(String[] args) {
		String s1 = " ";
		
		//isEmpty doesn't check for blank space - it was there before Java 11
		System.out.println("Is Empty: "+s1.isEmpty());
		System.out.println("Is Blank: "+s1.isBlank()); // Java 11
		// methods like strip(), stripLeading(), stripTrailing()
		String text = "\u2001 hello world ";
		//trim() method doesn't recognize unicode, but strip recognizes unicode spaces
		System.out.println(text.trim().length());
		System.out.println(text.strip().length());
	}
}
