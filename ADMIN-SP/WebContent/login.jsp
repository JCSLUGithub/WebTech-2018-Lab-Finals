<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>LOGIN.JSP</title>
</head>

<body>

	<h1>ADMIN/SP LOGIN PAGE</h1>
	
	<form action="Login" method="POST">
		Username: <input type="text" name="username" required><br>
		Password: <input type="password" name="password" required><br>
	<input type="submit" value="Login">
	
	</form>
	
	<a href="register.jsp">Create an Account</a>

</body>

</html>