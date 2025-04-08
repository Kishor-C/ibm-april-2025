package com.ibm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestThrowAndThrows {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter filename");
		try {
			// FileReader throws FileNotFoundException, close the reader & buffer in finally
			FileReader reader = new FileReader(scan.next());
			BufferedReader buffer = new BufferedReader(reader); // loads the entire file into buffer
			int ch = 0;
			int loopCounter = 0;
//			// -1 is returned when there are no characters to read
//			while((ch = reader.read()) != -1) { //read method reads one character at a time
//				char c = (char)ch;
//				System.out.print(c);
//				loopCounter++;
//			}
			String line = null;
			do {
				 line = buffer.readLine(); // readLine reads one line at a time, it throws IOException
				 if(line != null) {
					 System.out.println(line);
				 }
				 loopCounter++;
			} while(line != null);
			System.out.println("Loop Counter = "+loopCounter);
		} catch(IOException  e) { //IOException can handle FileNotFoundException
			System.err.println(e.getMessage());
			System.err.println("Unable to read the file");
		}
		System.out.println("DONE");
	}
	
}
