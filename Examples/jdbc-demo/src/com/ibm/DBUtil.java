package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/*
 * To reuse the connection logic
 */
public class DBUtil {

	// return connection
	
	public static Connection establishConnection() throws ClassNotFoundException, SQLException {
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/ibm_db";
		String driverClassName = Driver.class.getName();
		Class.forName(driverClassName); //com.mysql.cj.jdbc.Driver
		// All the JDBC apis are imported from java.sql package
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
}
