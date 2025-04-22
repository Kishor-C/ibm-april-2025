package com.ibm.buisness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.Employee;
import com.ibm.dao.EmployeeRepo;

@Service //bean id = "employeeService"
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeDao;
	
	public void deleteEmployee(int id) {
		
	}
	
	public int saveEmployee(Employee employee) {
		int status = employeeDao.save(employee);
		return status;
	}
	// invokes findAll of DAO
	public List<Employee> findEmployees() {
		return employeeDao.findAll();
	}
}
