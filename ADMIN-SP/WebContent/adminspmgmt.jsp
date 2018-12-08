<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>ADMINSPMGMT.JSP</title>
</head>

<body>

	<h1>Admin/SP Account Management Page</h1>
	
	<table border="1">
		<tr>
			<th>Account ID</th>
			<th>Username</th>
			<th>Email</th>
			<th>Contact Number</th>
			<th>Service Provider Name</th>
			<th>Date of Registration</th>
			<th>Account Status</th>
			<th>Action</th>
		</tr>
		
		<c:choose>
			
			<c:when test="${empty accountList}">
				<tr>
					<td colspan="7">No Results to Display</td>
				</tr>
			</c:when>
			
			<c:otherwise>
				<c:forEach items="${accountList}" var="account">
					<tr>
						<td>${account.adminSPID}</td>
						<td>${account.username}</td>
						<td>${account.email}</td>
						<td>${account.contact}</td>
						<td>${account.businessName}</td>
						<td>${account.registrationDate}</td>
						<td>${account.accountStatus}</td>
						<td>
							<a href="ViewAccount?accountID=${account.adminSPID}">View This Account</a><br>
							<a href="ActivateAccount?accountID=${account.adminSPID}">Activate</a><br>
							<a href="SuspendAccount?accountID=${account.adminSPID}">Suspend</a><br>
							<a href="DeactivateAccount?accountID=${account.adminSPID}">Deactivate</a><br>
							<a href="DeclineAccount?accountID=${account.adminSPID}">Decline</a>
						</td>
					</tr>
				</c:forEach>
			</c:otherwise>
			
		</c:choose>
	</table>

</body>

</html>