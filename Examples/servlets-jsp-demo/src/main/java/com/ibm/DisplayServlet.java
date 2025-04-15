package com.ibm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter(); // response is the 2nd parameter of doGet & doPost
		// PrintWriter prints on the browser so you must print html tags
		
		HttpSession s = request.getSession(); // creates or uses the existing one
		String name = (String)s.getAttribute("nameKey");
		pw.print("<html><body><h2> Hello "+name); // request is the 1st parameter, 
		//getParameter reads the data with a key
		pw.print("<br/>Phone = "+request.getParameter("ph")+"<br/>");
		pw.print("</h2>");
		pw.print("<h3>This is DisplayServlet method</h3>");
		pw.print("</body></html>");
		
	}

}
