package com.core.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTableCopy {

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
			Statement st1 = con.createStatement();
			
			String query = "select * from user";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String uname=rs.getString(2);
				String email=rs.getString(3);
				String password=rs.getString(4);
				
				String query1 = "insert into usercopy values('"+id+"','"+uname+"','"+email+"','"+password+"')";
				st1.executeUpdate(query1);
			}
			
			System.out.println("Data copy to other table successfully");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
