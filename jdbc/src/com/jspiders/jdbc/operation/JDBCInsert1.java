package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert1 {
	
	private static Driver  driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) {
		try {
			connection = openConnection();
			statement = connection.createStatement();
			query = "insert into student values(2,'suresh','suresh@gmail.com',25,3000)";
			int row =statement.executeUpdate(query);
			System.out.println(row + " row(s) affected.");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static Connection openConnection() throws SQLException {
		// TODO Auto-generated method stub
		driver =  new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3","root","root");
	}
	
	private static void closeConnection() throws SQLException {
		// TODO Auto-generated method stub
		if (statement != null) {
			statement.close();
		}
		
		if (connection != null) {
			connection.close();
		}
		
	}

}
