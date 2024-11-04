package com.core.assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseDemoAssigment {
	
	public static void main(String[] args) {
		
		
try {
			
			System.out.println("Start connection .......");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/";
			String dname= "batch189";
			String user="root";
			String pass="root";
			Connection con = DriverManager.getConnection(url+dname,user,pass);
			
			System.out.println("Connect Establised ...... ");
			
			Statement st = con.createStatement();
			
			String query = "select * from usercopy";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String uname=rs.getString(2);
				String email=rs.getString(3);
				String password=rs.getString(4);
				
				System.out.println("-----------------------------------------------");
				System.out.println(id+" | "+uname+" | "+email+" | "+password);
				System.out.println("-----------------------------------------------");
				
				
			}
			
			System.out.println("Data of table print successfully");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
