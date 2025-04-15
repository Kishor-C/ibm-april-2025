<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@taglib uri = "jakarta.tags.core" prefix = "c" %>
	<!--  old JSTL was using  https://java.sum.com/jsp/jstl/core -->
	
	<h2>This is JSP Content</h2>
	<h3>Message: ${sessionScope.msg}</h3>
	<h2>Using JSTL to iterate with forEach tag</h2>
	<!--  for(String s : users) -->
	<c:forEach var="s" items="${sessionScope.users}">
		<p>${s}</p>
	</c:forEach>
	<h2>Printing in List format</h2>
	<ol style = "color:blue">
		<c:forEach var = "s" items = "${sessionScope.users}">
			<li>${s}</li>
		</c:forEach>
	</ol>
</body>
</html>