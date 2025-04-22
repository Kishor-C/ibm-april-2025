package com.ibm.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.Employee;

@Repository
public class EmployeeJdbcRepo implements EmployeeRepo {
	
	//jdbc template injection
	
	@Autowired
	private JdbcTemplate jdbcTemp;

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int save(Employee employee) {
		String query = "insert into employee(name, dob) values(?, ?)";
		
		int count = jdbcTemp.update(query, employee.getName(), Date.valueOf(employee.getDob())); //java.sql.Date
		return count;
		// return jdbcTemplate.update("......", .....);
	}

	@Override
	public List<Employee> findAll() {
		String selectQuery = "select * from employee";
		//jdbcTemp.query(query, RowMapper);
		List<Employee> list = jdbcTemp.query(selectQuery, 
				(rs, row) -> new Employee(rs.getInt("id"), rs.getString("name"), rs.getDate(3).toLocalDate()));
		return list;
		/*
		 * RowMapper has a method mapRow(ResultSet rs, int row) returns an object, hence we write a lambda expression
		 * (rs, row) -> returing an employee object
		 * each object returned is automatically added to the List<Employee>, we don't have to create a list
		 */
		//return null;
	}


}
