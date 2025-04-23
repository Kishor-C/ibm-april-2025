package com.ibm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	/*JPQL - a query to the entity 
	 you don't have to implement this, spring boot does the implementation
	 you only need to call this method by passing the name & get all the employees having this name
	 */
	@Query("select e from Employee e where e.name = ?1")
	public List<Employee> findAllByName(String name);
}
