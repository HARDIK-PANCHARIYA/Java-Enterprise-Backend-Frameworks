package com.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCInsertDemo {
	
	public static void main(String[] args) {
		
		int id;
		String uname;
		String email;
		String password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id ");
		id=sc.nextInt();
		System.out.println("Enter name ");
		uname=sc.next();
		System.out.println("Enter email ");
		email=sc.next();
		System.err.println("Enter password ");
		password=sc.next();
		
		
		try {
			
			System.out.println("Program Start");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch189","root","root");
			System.out.println("load sueccessfully");
			
//			Statement st = con.createStatement();
//			String query = "insert into user values(103,'vedant','vedant@gmail.com','vedant@1234')";
//			st.execute(query);
//			System.out.println("Record insert successfully");
			
		String query = "insert into user value(?,?,?,?)";
		PreparedStatement pt = con.prepareStatement(query);
		pt.setInt(1, id);
		pt.setString(2, uname);
		pt.setString(3, email);
		pt.setString(4, password);
		pt.execute();
		System.out.println("Record insert successfully");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
