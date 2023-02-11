package com.StudentManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Studentdao {

	public static boolean insertStudentToDB(Student s1) {

		boolean f = false;

		try {

			// jdbc code.....
			Connection con = Connection_Provider.createc();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";

			// PreparedStatement

			PreparedStatement pstmt = con.prepareStatement(q);
			// set the value of parameter

			pstmt.setString(1, s1.getStudentName());
			pstmt.setString(2, s1.getStudentPhone());
			pstmt.setString(3, s1.getStudentCity());

			// execute...

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;

	}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		boolean f = false;

		try {

			// jdbc code.....
			Connection con = Connection_Provider.createc();
			String q = "delete from students where sid=?";

			// PreparedStatement

			PreparedStatement pstmt = con.prepareStatement(q);
			// set the value of parameter

			pstmt.setInt(1, userId);

			// execute...

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;

	}

	public static void showAllStudent() {
		// TODO Auto-generated method stub
		boolean f = false;

		try {

			// jdbc code.....
			Connection con = Connection_Provider.createc();
			String q = "select * from students;";

			Statement stmt=con.createStatement();
			
			ResultSet set=stmt.executeQuery(q);
			
            while(set.next()) {
            	int id=set.getInt(1);
            	String name=set.getString(2);
            	String phone=set.getString(3);
            	String city=set.getString("scity");
            	
            	System.out.println("ID : "+id);
            	System.out.println("Name : "+name);
            	System.out.println("Phone : "+phone);
            	System.out.println("City : "+city);
            	System.out.println("+++++++++++++++++++++++++++++++++++");
            	
            }			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	
	}
}