package com.core.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("I am in constructor");
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		
		out.println("<h3>User Name :- "+userName+"</h3>");
		out.println("<h3>Password :- "+password+"</h3>");
		out.println("<h3>Email :- "+email+"</h3>");
		out.println("<h4 style='color:green'>Thanks for Registration");
		
		System.out.println(userName);
		
		request.setAttribute("u",userName);
		request.setAttribute("p",password);
		request.setAttribute("e",email);
		
		RequestDispatcher rd = request.getRequestDispatcher("thanks.jsp");
		rd.forward(request, response);
	}
	
	public void init() {
		System.err.println("i am in init method");
	}
	
	public void destroy() {
		System.out.println("i am in destroy method");
	}
	
	

}
