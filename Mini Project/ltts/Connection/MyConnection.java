package com.ltts.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	
	public static Connection getConnection() throws Exception
	{
		
		Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/vaibhav","root","root");
		return con;
		
	}
	

}
