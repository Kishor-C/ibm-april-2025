package com.ibm;

public class TestDebugging {
	public static void main(String[] args) {
		System.out.println("main method starts");
		int[] items = {20, 30, 10, 50, 40};
		int result = sum(items);
		display(result++);
	}
	public static int sum(int[] items) {
		int result = 0;
		for(int item : items) {
			result = result + item;
		}
		return result;
	}
	public static void display(int result) {
		result++;
		System.out.println("v = "+result);
	}
}
