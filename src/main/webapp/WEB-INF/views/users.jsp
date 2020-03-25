<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>
	
	<table border="1">
		<tbody>
			<tr>
				<th>Name</th>
				<th>Lastname</th>
				<th>Username</th>
				<th>Password</th>
			</tr>
			<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.name}</td>
				<td>${user.lastname}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>