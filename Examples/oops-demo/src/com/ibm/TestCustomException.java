package com.ibm;

import java.util.Scanner;

public class TestCustomException {
	
	/*
	 * search method generates EmployeeNotFoundException and throws it to the caller
	 * so that caller must take care of handling it
	 */
	public static String find(int id) throws EmployeeNotFoundException {
		// throw would be the last statement in the execution, you can't write anything after throw
		if(id == -1 || id == 0) {
			throw new EmployeeNotFoundException("Employee with an id "+id+" not found");
		} 
		
		return "Id = "+id+" found";
	}
	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter id");
			String result = find(scan.nextInt());
			find(20);
			System.out.println(result);
		} catch(EmployeeNotFoundException e) {
			System.err.println(e.getMessage());
		} 
		System.out.println("Program exits");
	}
}
