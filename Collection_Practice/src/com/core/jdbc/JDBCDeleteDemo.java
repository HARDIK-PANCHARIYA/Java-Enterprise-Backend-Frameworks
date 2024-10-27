package com.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDeleteDemo {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/";
			String dname= "batch189";
			String user="root";
			String pass="root";
			Connection con = DriverManager.getConnection(url+dname,user,pass);
			Statement st = con.createStatement();
			
			String query = "delete from user where username='vedant' ";
			st.execute(query);
			System.out.println("Record delete successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
