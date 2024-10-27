package com.core.jdbc.assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelectDemo {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/";
			String dname= "batch189";
			String user="root";
			String pass="root";
			Connection con = DriverManager.getConnection(url+dname,user,pass);
			Statement st = con.createStatement();
			String query = "select * from student";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String uname = rs.getString(2);
				int age=rs.getInt(3);
				double marks=rs.getDouble(4);
				
				System.out.println(id+" "+uname+" "+age+" "+marks);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
