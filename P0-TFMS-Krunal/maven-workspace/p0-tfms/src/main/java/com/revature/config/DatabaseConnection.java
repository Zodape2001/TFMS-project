package com.revature.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static Connection con=null;
	static {
		String url="jdbc:mysql://localhost/tfms_db_krunal";
		String user= "root";
		String pass="1234";
		
	try {
		con=DriverManager.getConnection(url,user, pass);
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
	}
}