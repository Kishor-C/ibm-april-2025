package com.ibm;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class TestMultiCatch {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int num = scan.nextInt();
			if(num == 1) throw new ArithmeticException();
			if(num == 2) throw new RuntimeException();
			if(num == 3) throw new IOException();
			if(num == 4) throw new ArrayIndexOutOfBoundsException();
			if(num == 5) throw new SQLException();
		} 
		catch(ArithmeticException | SQLException | IOException e) {
			System.out.println("4");
		} catch(Exception e) {
			System.out.println("5");
		}
		
	}
}
