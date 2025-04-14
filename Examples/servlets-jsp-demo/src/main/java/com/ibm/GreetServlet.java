package com.ibm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GreetServlet
 */
@WebServlet("/GreetServlet")
public class GreetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter(); // response is the 2nd parameter of doGet & doPost
		// PrintWriter prints on the browser so you must print html tags
		pw.print("<html><body><h2 style = 'color:green'> Hello "+request.getParameter("name")); // request is the 1st parameter, 
		//getParameter reads the data with a key
		pw.print("</h2>");
		pw.print("<h3>This is inside GET method</h3>");
		pw.print("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter(); // response is the 2nd parameter of doGet & doPost
		// PrintWriter prints on the browser so you must print html tags
		pw.print("<html><body><h2> Hello "+request.getParameter("name")); // request is the 1st parameter, 
		//getParameter reads the data with a key
		pw.print("</h2>");
		pw.print("<h3>This is inside POST method</h3>");
		pw.print("</body></html>");
	}

}
