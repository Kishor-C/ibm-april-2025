package com.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculator {
	
	@Test
	public void testStatic() {
		Calculator r = new Calculator();
		assertEquals(r.add(20, 30), 52);
	}
}
