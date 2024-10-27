package com.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUpdateDemo {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/";
			String dname= "batch189";
			String user="root";
			String pass="root";
			Connection con = DriverManager.getConnection(url+dname,user,pass);
			
			Statement st = con.createStatement();
			String query = "update user set username='Ram' where userid=104";
			st.executeUpdate(query);
			System.out.println("Record update");
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
