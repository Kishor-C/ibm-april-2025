package com.ibm;

public class TestFundamentals {

	public static void main(String[] args) {
		/* primitive datatypes and variables
		 byte(1), short(2), int(4), long(8) - int values | 
		 float(4) & double(8) - floating point values
		 char(2) stores single character, boolean(unspecific) stores true or false
		 byte range is -128 to -1, 0 to 127
		 Primitive datatypes - int, float, double, char, boolean, byte, short, long
		 Non-Primitive datatypes - Arrays, Userdefined classes and inbuilt classes
		 Operators - +, -, *, /, %, <, >, !=, ==, ++, --
		 */
		int id = 2567; // it is an employee id
		char gender = 'M'; // single quote
		float salary = 45000.0f; // float needs f or F at the end else it is treated as double
		boolean isMarried = false; // boolean takes true or false
		String name = "Vijay"; // String is a complex type because it is of class type
		
		System.out.println("Id = "+id);
		System.out.println("Name = "+name+", Salary = "+salary+", Gender = "+gender+", Is Married = "+isMarried);
		int counter = 10;
		int size = 15;
		System.out.println("Counter = "+counter++); // post increment
		System.out.println("Counter = "+counter); // 11
		System.out.println("Size = "+(++size)); // pre increment
		System.out.println("Size = "+size);
		// conditional statements if, else
		if(size > counter) {
			System.out.println(size+" > "+counter);
		} else {
			System.out.println(size +" not > "+counter);
		}  
		// if else if else ladder - if(..){} else if(..) {} else if(..) {}... else
		int marks = 80; // 0 to 100 -> display grades like A, B, C
		if(marks >= 75) {
			System.out.println("Grade A+");
		} else if(marks < 75 && marks >= 70) {
			System.out.println("Grade A");
		} else if(marks < 70 && marks >= 60) {
			System.out.println("Grade B");
		} else {
			System.out.println("Grade C");
		}
		/*
		 *  try switch statement - it is similar to if else but it evaluates based on the options
		 *  syntax: 
		 *  switch(option) {
		 *    case optionValue : some statement;
		 *                         break;
		 *    case optionValue : some statement;
		 *                         break;
		 *    default : some statement; // doesn't need break
		 *                     
		 *  }
		 *  ex: 
		 *  String option = "1";
		 *  1 -> print have a coffee
		 *  2 -> print have a tea
		 *  3 -> print have a cold drink
		 *  4 -> print have an hot water
		 *  5 -> default value like no valid option thank you
		 */
		
		String option = "8";
		switch(option) {
		case "1": System.out.println("have a nice coffee");
		break;
		case "2": System.out.println("have a nice tea");
		break;
		case "3": System.out.println("have a nice cold drink");
		break;
		case "4": System.out.println("have a hot water");
		break;
		default : System.out.println("Invalid option");
		}
		/*
		 * Loops: when you want same statements to executed until the condition is true
		 * or when you want same statements to execute for specific number of times
		 * types of loops - for, while, do-while
		 * 
		 */
		// for loop is better for arrays 
		String[] fruits = {"apple" ,"mango", "orange"};
		System.out.println("Size of an array = "+fruits.length);
		for(int i = 0; i < fruits.length; i++) { // i = 3, 3 < 3
			System.out.println("Fruits at position "+(i+1)+" = "+fruits[i]);
		}
	}

}
