package com.ibm.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.Employee;
import com.ibm.buisness.EmployeeService;

public class EmployeeViewController {
	/*
	 * In web app you will have a controller & view separate
	 * Here main itself is view & controller
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// get the service object which is having an id employeeService
		EmployeeService service = (EmployeeService)context.getBean("employeeService");
		
		
		System.out.println("**** Invoking the findEmployees *****");
		List<Employee> list = service.findEmployees();
		list.forEach(item -> System.out.println(item));
		
//		System.out.println("**** Invoking the saveEmployee *****");
//		
//		Employee emp = new Employee();
//		emp.setName("Sachin");
//		emp.setDob(LocalDate.parse("1975-04-24"));
//		int status = service.saveEmployee(emp);
//		System.out.println("Status = "+status);
		//service.deleteEmployee(1234);
		//closing the container
		ClassPathXmlApplicationContext container = (ClassPathXmlApplicationContext)context;
		container.close();
	}
}
