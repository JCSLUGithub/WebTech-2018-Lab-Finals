<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>CLIENTMGMT.JSP</title>
</head>

<body>

	<h1>Client Account Management Page</h1>
	
	<table border="1">
		<tr>
			<th>Account ID</th>
			<th>Username</th>
			<th>Email</th>
			<th>Contact Number</th>
			<th>Client Name</th>
			<th>Date of Registration</th>
			<th>Account Status</th>
			<th>Actions</th>
		</tr>
		
		<c:choose>
		
			<c:when test="${empty accountList}">
				<tr>
					<td colspan="7">No Results to Display</td>
				</tr>
			</c:when>
			
			<c:otherwise>
				<c:forEach var="account" items="${accountList}">
					<tr>
						<td>${account.clientID}</td>
						<td>${account.username}</td>
						<td>${account.email}</td>
						<td>${account.contact}</td>
						<td>${account.firstName} ${account.lastName}</td>
						<td>${account.registrationDate}</td>
						<td>${account.accountStatus}</td>
						<td>
							<a href="ViewClientAccount?accountID=${account.clientID}">View This Account</a><br>
							<a href="ActivateClientAccount?accountID=${account.clientID}">Activate</a><br>
							<a href="SuspendClientAccount?accountID=${account.clientID}">Suspend</a><br>
							<a href="DeactivateClientAccount?accountID=${account.clientID}">Deactivate</a><br>
							<a href="DeclineClientAccount?accountID=${account.clientID}">Decline</a>
						</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>

</body>

</html>