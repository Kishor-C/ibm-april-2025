package com.ibm;


public class TestQuiz {
	public static void main(String[] args) {
		int[] items = {2, 1, 3, 5} ;
		
		for(int item : items) {
			System.out.println(items[item]); //items[2], items[1], items[3], items[5]
		}
		System.out.println("DONE...");
	}
}
