<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>SERVICEMGMT.JSP</title>
</head>

<body>
	
	<%
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Expires", "0");
	
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	
	%>
	
	<table>
	
		<tr>
			<th>Service ID</th>
			<th>Service Provider</th>
			<th>Service Name</th>
			<th>Service Fee</th>
			<th>Service Status</th>
		</tr>
		
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		
	</table>
	
</body>

</html>