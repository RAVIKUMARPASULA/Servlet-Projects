package com.createiq.students.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;



public class ConnectionUtil {
	private static Properties properties = null;
	static {
		properties=new Properties();
		
		try {
			properties.load(ConnectionUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			Class.forName(properties.getProperty("driver"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
	public static Connection getConnection() {
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
			System.out.println("success connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return connection;
		
	}
	public static void main(String[] args) {
		ConnectionUtil connectionUtil=new ConnectionUtil();
		System.out.println(connectionUtil.getConnection());
	}
//	public static void close(PreparedStatement preparedStatement, Connection connection) {
//		
//	}

}
