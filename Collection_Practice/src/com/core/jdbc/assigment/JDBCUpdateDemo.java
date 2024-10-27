package com.core.jdbc.assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCUpdateDemo {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/";
			String dname= "batch189";
			String user="root";
			String pass="root";
			Connection con = DriverManager.getConnection(url+dname,user,pass);
			PreparedStatement pstmt=null;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the id of student whose data you want to update = ");
			int id = sc.nextInt();
			System.out.println("Enter your choice : ");
			System.out.println("1. update Student Name ");
			System.out.println("2. update Student age :");
			System.out.println("3. update Student Marks :  ");
			int choice = sc.nextInt();
			
			
			
			switch (choice) {
            case 1:
                System.out.println("Enter new Student Name:");
                String name = sc.next();
                String query1 = "UPDATE student SET studname = ? WHERE studid = ?";
                pstmt= con.prepareStatement(query1);
    			pstmt.setString(1, name);
    			
    			System.out.println("Name update Successfully");
                break;
            case 2:
                System.out.println("Enter new Student Age:");
                int age = sc.nextInt();
                String query2 = "UPDATE student SET age = ? WHERE studid = ?";
    			pstmt = con.prepareStatement(query2);
    			pstmt.setInt(1, age);
    			System.out.println("age update Successfully");
                break;
            case 3:
                System.out.println("Enter new Student Marks:");
                double marks = sc.nextInt();
                String query3 = "UPDATE student SET marks = ? WHERE studid = ?";
                pstmt = con.prepareStatement(query3);
                pstmt.setDouble(1, marks);
    			System.out.println("marks update Successfully");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
			}
			
			pstmt.setInt(2, id);
			pstmt.execute();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hiiiii");
		
	}

}
