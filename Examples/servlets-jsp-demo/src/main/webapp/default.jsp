<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>This is JSP Content</h2>
	<%-- comments in JSP --%>
	<%-- You can write java code using scriptlet elements --%>
	
	<%
		String name = "Kishor";
		int counter = 0; // local variable inside a method
		counter++;
		mainCounter++;
	%>
	
	<%-- there is a declarative tag in JSP to declare instance variables --%>
	
	<%!
		int mainCounter = 0; // you can only declare variables but can't write any statements
		
	%>
	<%-- to print you use expression tag in JSP --%>
	<h2>Counter: <%=counter %>, Main Counter: <%=mainCounter %></h2>
</body>
</html>