<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
	${action}
	<form:form action="/springMvcConfigurationPractice/users/save" method="post" modelAttribute="user">
		<table>
			<tbody>
				<tr>
					<td>Name:</td>
					<td>
						<form:input path="name" id="name"/>
					</td>
				</tr>
				<tr>
					<td>Lastname:</td>
					<td>
						<form:input path="lastname" id="lastname"/>
					</td>
				</tr>
				<tr>
					<td>Username:</td>
					<td>
						<form:input path="username" id="username"/>
					</td>
				</tr>
				<tr>
					<td>Password:</td>
					<td>
						<form:input path="password" id="password"/>
					</td>
				</tr>
				<tr>
					<td>
						<button id="save">Save</button>
					</td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>