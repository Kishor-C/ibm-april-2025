package com.ibm;

class Outer {
	// non-static inner class - will have access to outer class members
	class Inner {
		void demo() {
			System.out.println("demo inside inner class");
		}
	}
	// static inner class - will have access to static members of outer class
	static class StaticInner {
		void test() {
			System.out.println("test() inside static inner class");
		}
	}
}

public class TestInnerClasses {
	public static void main(String[] args) {
		// inner class object
		Outer.Inner inner = new Outer().new Inner();
		inner.demo();
		// static inner class object
		Outer.StaticInner staticInner = new Outer.StaticInner();
		staticInner.test();
		// anonymous & local inner class you can create inside the method which are not accessible outside the method
		// anonymous inner class is a sub class without any name - more widely used in collection f/w
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("run() method");
			}
		};
		new Thread(r).start();
		// local inner class will have name, which is avaiable only inside the method
		// class L is written inside method
		class L {
			void m1() { System.out.println("m1() inside L"); }
		}
		L l = new L();
		l.m1();
	}
}
