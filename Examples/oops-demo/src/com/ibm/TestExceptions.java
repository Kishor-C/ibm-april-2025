package com.ibm;

public class TestExceptions {
	public static void main(String[] args) {
		// understanding try-catch & finally block flow
		try {
			int[] items = {2, 1, 3, 4};
			int index = 0;
			int element = 1;
			System.out.println("Item = "+items[index]);
			System.out.println("Div = "+element/index);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOBE");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("DONE...");
	}
}
