package com.ibm;

public class TestExceptionFlow {

	public static void main(String[] args) {
		int result = find(0);
		System.out.println("Result = "+result);
	}
	
	public static int find(int x) {
		try {
			int r = 10/x;
			return r;
		} catch(ArithmeticException e) {
			return -1;
		}
		finally {
			return 2;
		}
	}

}
