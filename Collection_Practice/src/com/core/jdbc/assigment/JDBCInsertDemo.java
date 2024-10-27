package com.core.jdbc.assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCInsertDemo {
	
	public static void main(String[] args) {
		
		int stuid;
		String studname;
		int age;
		double marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id");
		stuid=sc.nextInt();
		System.out.println("Enter Student name");
		studname=sc.next();
		System.out.println("Enter Student age");
		age=sc.nextInt();
		System.out.println("Enter Student marks");
		marks=sc.nextDouble();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/";
			String dname= "batch189";
			String user="root";
			String pass="root";
			Connection con = DriverManager.getConnection(url+dname,user,pass);
			
//			Statement st = con.createStatement();
//			String query = "insert into student value(101,'Hardik',25,78.1)";
//			st.execute(query);
//			System.out.println("Record insert successfully");
			
			String query = "insert into student value(?,?,?,?)";
			PreparedStatement pt = con.prepareStatement(query);
			pt.setInt(1,stuid);
			pt.setString(2,studname);
			pt.setInt(3, age);
			pt.setDouble(4, marks);
			pt.execute();
			
			System.out.println("Record insert successfully");
			
			
			
			
			
		}catch(Exception e) {
				e.printStackTrace();
		}
		
		
	}

}
