package com.core.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OperationServlet")
public class OperationServlet extends HttpServlet {

    public OperationServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		String opr = request.getParameter("opr");
		int result;
		
		if(opr.equals("+")) {
			result=n1+n2;
			request.setAttribute("n1", n1);
			request.setAttribute("n2", n2);
			request.setAttribute("opr", opr);
			request.setAttribute("r", result);
			RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		}
		
		else if(opr.equals("-")) {
			result=n1-n2;
			request.setAttribute("n1", n1);
			request.setAttribute("n2", n2);
			request.setAttribute("opr", opr);
			request.setAttribute("r", result);
			RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		}
		
		else if(opr.equals("*")) {
			result=n1*n2;
			request.setAttribute("n1", n1);
			request.setAttribute("n2", n2);
			request.setAttribute("opr", opr);
			request.setAttribute("r", result);
			RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		}
		
		else if(opr.equals("/")) {
			result=n1/n2;
			request.setAttribute("n1", n1);
			request.setAttribute("n2", n2);
			request.setAttribute("opr", opr);
			request.setAttribute("r", result);
			RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		}
		else {
			System.out.println("Something went wrong");
		}
		
	}

}
