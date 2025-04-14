package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

// DAO layer that will have only DB logic
public class EmployeeDao {

	// get all the employee objects and return in the List<Employee> format
	public List<Employee> findAllEmployees() {
		List<Employee> list = new ArrayList<>(); // Java 7 onwards you don't need to specify type at the right-side
		// JDBC code goes here you must not print employee records rather store in the list
		// cut the main method entire logic & paste before return list, then change the code to create Employee
		// object & adding each employee to the list
		try {
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/ibm_db";
			String driverClassName = Driver.class.getName();
			Class.forName(driverClassName); //com.mysql.cj.jdbc.Driver
			// All the JDBC apis are imported from java.sql package
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "select * from employee";
			PreparedStatement statement = con.prepareStatement(query); // no ? so no need to set value
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				// below code is similar to Employee emp = new Employee(100, "Raj", LocalDate.parse("2000-10-20"));
				Employee emp = new Employee(result.getInt("ID"), 
						result.getString("NAME"), result.getDate("DOB").toLocalDate());
				list.add(emp);
			}
			// closing the resources
			result.close();
			statement.close();
			con.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
