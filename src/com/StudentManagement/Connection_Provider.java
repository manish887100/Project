package com.StudentManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_Provider {
	
	 static Connection con;
	
	public static Connection createc() {
	try {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String user = "user=root&";
		String password = "password=1804";
		String url = "jdbc:mysql://localhost/student_manage?";
		
		con=DriverManager.getConnection(url+user+password);
		
		
	} catch (Exception e) {
		// TODO: handle exception

		e.printStackTrace();
	}
	
	return con;
	
	}
	

}
