package com.core.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("uname");
		String pass = request.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch189", "root", "root");
			String s = "select uname,password from user1 where uname='" + userName + "' and password='" + pass + "' ";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(s);
			if (rs.next()) {

				ArrayList<String> al = new ArrayList();
				al.add("Hardik");
				al.add("Sanket");
				al.add("Ritesh");
				al.add("Prajwal");
				
				request.setAttribute("data", al);
				request.setAttribute("u", userName);

				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);

			} else {

				request.setAttribute("msg", "<h3 style='color:green'>invalid username and passwoord !!!!</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);

			}

		} catch (Exception e) {

		}

	}

}
