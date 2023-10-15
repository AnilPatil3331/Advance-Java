package com.jspiders.jdbc.operation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCSelect1 {
	
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) throws SQLException {
		try {
			connection= openConnection();
			statement = connection.createStatement();
			query ="select * from student";
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getInt(4));
				System.out.println(resultSet.getDouble(5));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeConnection();
		}
	}

	private static Connection openConnection() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		File  file = new File("D:/WEJA3/Test.txt");
		FileReader fileReader= new FileReader(file);
		Properties properties = new Properties();
		properties.load(fileReader);
		return DriverManager.getConnection(properties.getProperty("url"), properties);
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
