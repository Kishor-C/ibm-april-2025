<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
</head>
<body>
	<%@taglib uri = "jakarta.tags.core" prefix = "c" %>
	<h2>Employee list</h2>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Id</th><th>Name</th><th>Dob</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items = "${msg}" var="e">
				<tr>
					<td>${e.id}</td>
					<td>${e.name}</td>
					<td>${e.dob}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>