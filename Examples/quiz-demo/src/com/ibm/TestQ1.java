package com.ibm;
/*
 * Can we override static method ?
 * Answer - No
 * 
 * What happens if you override static method
 * Answer - you don't get error, it will treated as a new method belonging to the sub-class
 * 
 * class X { 
 	 static void test() { System.out.println("1"); }
 * }
 * class Y extends X  {
 *	static void test() { System.out.println("2"); }
 * }
 * class Z { 
 	public static void main(String[] args) { 
 		X x1 = new Y();
 		x1.test(); // 1  x1.test() => converted to X.test()
 	}
 * }
 */
class X { 
	static void test() { System.out.println("1"); }
}
class Y extends X { 
	static void test() { System.out.println("2"); }
}
public class TestQ1 {
	public static void main(String[] args) {
		X x1 = new Y();
		x1.test();
	}
}
