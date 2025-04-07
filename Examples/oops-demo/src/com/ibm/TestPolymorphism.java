package com.ibm;

public class TestPolymorphism {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1234, "Raj", 5000, "r@g");
		Student student1 = new Student(88, "Vinay", "A", "v@g");
		Person person1 = new Person("Ravi", "r@g");
		printDetails(emp1);
		printDetails(student1);
		printDetails(person1);
		// overloading in println 
		System.out.println(25); // println(int) 
		System.out.println("Hello"); // println(String)
		System.out.println(person1); // println(Object)
		
	}
	/*
	 * printDetails can accept object of Person & all the sub class of Person 
	 */
	static void printDetails(Person per) { //1st person = emp1[Employee], 2nd person=student1[Student]
		per.display(); // this method can give one or more results
	}
}
