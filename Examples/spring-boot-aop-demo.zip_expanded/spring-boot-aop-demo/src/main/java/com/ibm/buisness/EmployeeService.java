package com.ibm.buisness;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	// you want to invoke a cross cutting concern before or after invoking this method
	// then AOP provides you some techniques like Aspect, Advice, PointCut, Join Point
	// findAll is a Join Point
	public void findAll() {
		System.out.println("____ findAll() is called___");
	}
	/*
	 * 
	 * To invoke findAll you need a controller or from main method also you 
	 * can invoke using context.getBean("employeeService")
	 */
}
