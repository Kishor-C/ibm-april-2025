package com.ibm;

public class TestLoops {
	public static void main(String[] args) {
		/*
		 * while & do while
		 * enhanced for loop: it has a simplified syntax to iterate all the elements in the array in forward-direction
		 	for(type v : collection) { } 
		 */
		int[] items = {20, 10, 30, 40, 50}; // for(int i = 0; i < items.length; i++) { items[i] } traditional
		for(int item : items) { // item is an element that is iterated
			System.out.println("item is: "+item); // items[item] will not work - it might throw exception
		}
		int loopCounter = 5;
		while(loopCounter < 5) {
			System.out.println("while loop: "+loopCounter);
			loopCounter = loopCounter + 2;
		}
		System.out.println("Loop counter = "+loopCounter);
		do {
			System.out.println("do-while loop: "+loopCounter);
		} while(loopCounter < 5); // switch - case -> options -> 1: withdraw 2: change pin 3: check balance 4: exit
	}
}
