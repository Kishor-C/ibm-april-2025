package com.ibm;

public class TestCLA {
	public static void main(String[] args) {
		/* To pass command line argument Right click on the java file -> Run As -> Run Configurations -> 
		 * Arguments -> Program Arguments -> enter input separated by space
		 * String[] args is a command line argument
		 * Wrapper classes - inbuilt classes to perform extra operations on primitives like
		 * converting to number, string, binary and so on
		 * int - Integer, double - Double, char - Character, byte - Byte, short - Short
		 */
		int sum = 0;
		for(String arg : args) {
			sum = sum + Integer.parseInt(arg); // parseInt takes string and returns an int
			System.out.println(arg);
		}
		System.out.println("Sum = "+sum);
		int data = 5;
		System.out.println("Binary value of "+data+" is "+Integer.toBinaryString(data));
		System.out.println(Character.isDigit('a'));
	}
}
