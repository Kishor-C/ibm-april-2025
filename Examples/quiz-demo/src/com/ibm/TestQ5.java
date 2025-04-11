package com.ibm;
/*
 * class A {
 		int x = 0;
 		public static void main(String[] args) {
 			System.out.println("x = "+x); 
 		}
  }
  Answer: compilation error because static method is accessing non-static member directly
 */
public class TestQ5 {
	static int x;
	public static void main(String[] args) {
		System.out.println("x = "+x); // prints 0
	}
}
