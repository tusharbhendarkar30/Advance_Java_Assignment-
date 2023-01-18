package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	
	private static Connection con;
	
	public static void openConnection()throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","Tushar123");
		System.out.println("connected to db");
	}
	
	public static Connection getcon() {
		return con;
	}
	
	public static void closeConnection() throws SQLException
	{
		if(con!=null)
		con.close();
	}

}