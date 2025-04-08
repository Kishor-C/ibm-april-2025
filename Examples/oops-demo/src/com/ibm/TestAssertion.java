package com.ibm;

import java.util.Scanner;

sealed class Foo permits X, Y{
	
}
non-sealed class X extends Foo{
	
}
final class Y extends Foo {
	
}
class Z extends X {
	
}

public class TestAssertion {
	public static void main(String[] args) {
		int age = 0;
		// whenever you use try with resource, using catch or finally is optional, however if you use 
		// old style try then either catch or finally must be there
		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter age");
			age = scan.nextInt();
		}
		assert (age >= 18) : "Age must not be < 18";
		System.out.println("DONE...");
	}
}
