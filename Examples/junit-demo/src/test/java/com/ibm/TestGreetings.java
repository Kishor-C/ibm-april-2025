package com.ibm;
/*
 * This must be in test folder
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestGreetings {

	private Greetings greet;
	// since you can write more than one @Test you can create the 
	// object in a setup method: @BeforeEach
	// which runs before each test case
	@BeforeEach // runs before @Test
	public void setUp() {
		System.out.println("setUp()");
		greet = new Greetings();
	}
	@AfterEach // runs after @Test
	public void tearDown() {
		System.out.println("tearDown()");
		greet = null;
	}
	@Test // this must have test case where you can compare actual & expected result
	public void test_welcome() {
		String actual = greet.welcome("Kishor");
		String expected = "Welcome Kishor";
		assertEquals(expected, actual); // assertEquals is a static method in Assertions class that needs to be imported
		System.out.println("test_welcome");
	}
	@Test
	public void test_isEven() throws RuntimeException {
		boolean isEven = greet.isEven(8);
		assertTrue(isEven);//expecting isEven to be true
		System.out.println("test_isEven");
	}
	@ParameterizedTest // you don't need to call a method multiple times with different parameter
	@ValueSource(ints = {2, 4, 6, 10, 8})
	public void test_isEvenMulitpleTimes(int num) { // num takes one value from @ValueSource at a time
		assertTrue(greet.isEven(num));
		System.out.println("test_isEventMulitpleTimes");
	}
	
	//@BeforeAll & @AfterAll - use these two annotations and observe the flow
}
