package com.ibm;

/*
 * class A { 
  		protected static void main(String[] args) { 
  			System.out.println("main() method");
  		}
 * }
 * a. compilation error
 * b. runtime error
 * c. compiles succesfully & doesn't print any thing
 * d. prints main() method
 * Answer (c)
 */
public class TestQ3 {
	public static void main(String[] args) {
		System.out.println("main with String[]");
	}

	public static void main(String args) {
		System.out.println("main with String");
	}
}
