package com.ibm.buisness;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.Employee;
import com.ibm.dao.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeDao; // injects the dynamic object
	/*
	 * EmployeeRepo has below methods
	 * public Employee save(Employee emp): saves or updates the employee and returns the saved/updated Employee
	 * public Optional<Employee> findById(int id): returns Optional based on the primary key you pass
	 * public List<Employee> findAll(): returns all the employees in List
	 * public void deleteById(int id): deletes the employee based on the primary key you pass
	 */
	// getting all the employees
	public List<Employee> findEmployees(){
		return employeeDao.findAll();
	}
	//getting a single employee or else throwing an exception
	public Employee findEmployee(int id) throws Exception {
		Optional<Employee> optional = employeeDao.findById(id);
		return optional.orElseThrow(()->new Exception("Sorry id "+id+" not found"));
	}
	//saving or updating an employee
	public Employee saveOrUpdate(Employee employee) {
		Employee savedEntity = employeeDao.save(employee);
		return savedEntity;
	}
	//deleting an employee based on the id
	public void deleteEmployee(int id) throws Exception {
		Employee employee = findEmployee(id); // calling the service.findEmployee(id)
		// if the exception is not thrown then it will be deleted
		// if the exception is thrown it means that id is not present
		employeeDao.delete(employee);
	}
}
