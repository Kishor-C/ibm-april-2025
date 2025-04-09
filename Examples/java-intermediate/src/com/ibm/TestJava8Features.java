package com.ibm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
/*
 * In Java 8 interfaces can have default methods & static methods
 */
interface A { 
	default void test1() {
		System.out.println("test1() is implemented in interface A");
	}
	static void test2() {
		System.out.println("test2() is static in interface A");
	}
	void test3();
	
}
public class TestJava8Features {
	public static void main(String[] args) {
		/* Java 8 has introduced new date & time classes in java.time package
		 * LocalDate, LocalTime, LocalDateTime - follows ISO standard, ISO format of Date : yyyy-MM-dd */
		// current date
		LocalDate today = LocalDate.now();
		System.out.println("Today = "+today);
		// specific date
		LocalDate dob = LocalDate.parse("2000-01-15");
		System.out.println("Dob = "+dob);
		// date & time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Date Time = "+dateTime);
		// of method creates an Immutable List
		List<Integer> list = List.of(50, 40, 10, 20, 30);
		System.out.println(list);
	}
}
