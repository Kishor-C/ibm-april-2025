package com.ibm;

public class TestTypeConversion {
	public static void main(String[] args) {
		int x = 30;
		int y = 50;
		Integer z = x; // autoboxing
		add(x, y); // add(int, int)
		add((byte)x, (byte)y); // explicit narrowing
		add(z, 30); // z -> Integer -> int to call add(int, int) -> auto-unboxing
	}
	
	// a static method can be directly called 
	public static void add(byte a, byte b) {
		System.out.println("add(byte, byte): "+(a + b));
	}
	// another static method with the same name - method overloading
	public static void add(int a, int b) {
		System.out.println("add(int, int): "+(a + b));
	}
}
