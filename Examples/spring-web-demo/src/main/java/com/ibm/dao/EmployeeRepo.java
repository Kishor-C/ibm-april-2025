package com.ibm.dao;

import java.util.List;

import com.ibm.Employee;

public interface EmployeeRepo {
	// we need to create crud methods that interacts with employee table
	// we will create only one method for the time being which we will modify later
	
	// deletes the employee based on the id
	void delete(int id);
	// store employee data in the table employee
	int save(Employee employee);
	// returns all the employee records in the form of List
	List<Employee> findAll();
}
