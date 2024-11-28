package com.core.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class signup extends HttpServlet {

    public signup() {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("uname");
		String pass = request.getParameter("password");
		String mail = request.getParameter("email");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch189", "root", "root");

//			String query = "INSERT INTO user1 (uname, password, email) VALUES (?, ?, ?)";
//			PreparedStatement pstmt = con.prepareStatement(query);
//			pstmt.setString(1, userName);
//			pstmt.setString(2, pass);
//			pstmt.setString(3, mail);
//			pstmt.executeUpdate();
			
			String query = "INSERT INTO user1 (uname, password, email) VALUES ('" + userName + "', '" + pass + "', '" + mail + "')";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
