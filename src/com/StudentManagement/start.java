package com.StudentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO EXIT APP");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				
			     System.out.println("Enter User Name :");
			     String name=br.readLine();
			     
			     System.out.println("Enter User Phone :");
			     String phone=br.readLine();
			     
			     System.out.println("Enter User City :");
			     String city=br.readLine();
			     
				Student s1=new Student(name, phone, city);
				
				boolean answer=Studentdao.insertStudentToDB(s1);
				if(answer) {
					System.out.println("Student is Added SuccessFully........");
				}
				else {
					
					System.out.println("Something Went Wrong....try again");
				}
				
				System.out.println(s1);
				
			}
			else if(c==2) {
				//delete student
				System.out.println("Enter Student ID to Delete: ");
				
				int userId=Integer.parseInt(br.readLine());
				boolean answer1=Studentdao.deleteStudent(userId);
				if(answer1) {
					System.out.println("Deleted...........");
				}
				else {
					System.out.println("Something Went Wrong.......");
				}
				
				
				
			}
			else if(c==3) {
				//Display Student
				Studentdao.showAllStudent();
				
				
			}
			else if(c==4) {
			//exit	
			  break;	
			}
			else {
				
				
			}
			
		}
		System.out.println("Thankyou for using My Application");
		System.out.println("See You Soon......bye bye");
	}

}
