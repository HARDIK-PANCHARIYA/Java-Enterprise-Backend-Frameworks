package com.core.jdbc.assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCSelectByIdDemo {
	
public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/";
			String dname= "batch189";
			String user="root";
			String pass="root";
			Connection con = DriverManager.getConnection(url+dname,user,pass);
			
			Scanner sc = new Scanner(System.in);
			int id=sc.nextInt();
			
			String query = "select * from student where studid=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int sid=rs.getInt(1);
				String uname = rs.getString(2);
				int age=rs.getInt(3);
				double marks=rs.getDouble(4);
				
				System.out.println(sid+" "+uname+" "+age+" "+marks);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
