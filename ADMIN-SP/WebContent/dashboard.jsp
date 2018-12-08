<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>DASHBOARD.JSP</title>
</head>

<body>
	
	<%
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Expires", "0");
	
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	
	%>
	
	<h1>Welcome to the SP/Admin Dashboard, ${username}!</h1>
	
	<form action="Logout" method="POST">
		<input type="submit" value="Logout">
	</form>
	
	<h2><a href="${pageContext.request.contextPath}/ViewAllAdminSPAccounts">Admin/SP Account Management</a></h2>
	
	<h2><a href="${pageContext.request.contextPath}/ViewAllClientAccounts">Client Account Management</a></h2>
	
	
	
	<h2><a href="servicemgmt.jsp">Service Management</a></h2>
	
	
</body>

</html>