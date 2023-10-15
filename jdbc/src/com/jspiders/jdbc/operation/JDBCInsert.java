package com.jspiders.jdbc.operation;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JDBCInsert {
	public static void main(String[] args) throws SQLException {
		
		//Register Driver
		Driver driver= new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		//Open connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3?user=root&password=root");
		
		//Create Statement
		Statement statement= connection.createStatement();
		
		//Prepare Statement
		ResultSet resultSet= statement.executeQuery("select * from student");
		
		//process result
		resultSet.next();
		
		//close connection
		connection.close();
		statement.close();
		resultSet.close();
		
	}
	}


