package com.ibm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GreetServlet
 */
@WebServlet("/GreetServlet")
public class GreetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] names = {"Raj", "Atharv", "Siddharth", "Ravi"};
		// instead of printing in Servlet pass this array to the JSP and let it iterate using JSTL
		String message = "This message is in Servlet";
		
		// storing the data in a session so that it will be accessible in JSP
		HttpSession sess = request.getSession();
		sess.setAttribute("msg", message);
		sess.setAttribute("users", names);
		// JSP should use msg & users like ${sessionScope.msg} & ${sessionScope.users}
		//dispatch the request to the JSP file default.jsp
		RequestDispatcher rd = request.getRequestDispatcher("default.jsp");
		rd.forward(request, response); // request & response are the parameters available in doGet
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
