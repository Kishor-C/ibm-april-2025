package com.ibm;
// constructors are not inherited, however subclass calls super class constructor using super() or super(args)
class Person { 
	String name;
	String email;	
//	Person() { 
//		System.out.println("Person()");
//	} 
	Person(String name, String email) {
		System.out.println("Person(name, email)");
		this.name = name;
		this.email = email;
	}
	void display() {
		System.out.println("____ Person Details ____");
		System.out.println("Name = "+name+", Email = "+email);
	}
}
class Student extends Person {
	int rollNo;
	String grade;
	Student() { //super();
		super("", "");
		System.out.println("Student()");
	}
	Student(int rollNo, String name, String grade, String email) { 
		super(name, email); //Person(String name, String email) - no need to explicitly initialize name & email
		System.out.println("Student(rollNo, name, grade, email)");
		this.rollNo = rollNo;
		this.grade = grade;
	}
	@Override
	void display() {
		System.out.println("____ Student Details ____");
		System.out.println("Name = "+name+", Email = "+email+", Grade = "+grade+", RollNo = "+rollNo);
	}
}
// create a display method in Employee class & print employee details
// create an employee class that will have id, name, salary, email, create constructors in employee
// then from the main method create an object of Employee & call the display
class Employee extends Person {
	int id;
	double salary;
	Employee(int id, String name, double salary, String email) {
		super(name, email);
		this.id = id;
		this.salary = salary;
		System.out.println("Employee(id, name, salary, email)");
	}
	@Override
	void display() {
		System.out.println("____ Employee Details ____");
		System.out.println("Name = "+name+", Email = "+email+", Id = "+id+", Salary = "+salary);
	}
}
public class TestInheritance {
	public static void main(String[] args) {
		Person person1 = new Person("Siddharth", "s@g");
		person1.display();
		System.out.println("_______________________________________");
		Student student1 = new Student(1, "Vishnu", "A", "v@g");
		student1.display(); // calling inherited method
		System.out.println("________________________________________");
		Employee employee1 = new Employee(123, "Atharva", 35000.0, "a@g");
		employee1.display();
	}
}
