package com.examples;

public class Calculator {
	public  int add(int x, int y) {
		int r = read(x);
		return (r + y);
	}
	public static int read(int x) {
		return x + 2;
	}
}
