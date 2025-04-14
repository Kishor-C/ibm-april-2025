package com.ibm;

import java.time.LocalDate;
import java.util.List;

public class TestSelectQuery {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		
		//storing the employee data
		
		Employee e = new Employee(0, "Siddharth", LocalDate.parse("2020-11-27"));
		int count = dao.saveEmployee(e);
		System.out.println("ID created is : "+count);
		
		List<Employee> list = dao.findAllEmployees();
		for(Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("______________________________________________");
	}
}
