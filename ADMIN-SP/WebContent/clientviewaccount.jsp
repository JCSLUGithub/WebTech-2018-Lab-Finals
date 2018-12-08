<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>CLIENTVIEWACCOUNT.JSP</title>
</head>

<body>

	<h1>View Client Account Page</h1>
	
	<h2>Viewing the account of: ${accountInfo.clientID}</h2>
	
		<b>Account ID:</b> ${accountInfo.clientID}<br>
		<b>Username:</b> ${accountInfo.username}<br>
		<b>Password:</b> ${accountInfo.password}<br>
		<b>Email:</b> ${accountInfo.email}<br>
		<b>Client Name:</b> ${accountInfo.firstName} ${accountInfo.lastName}<br>
		<b>Contact Number:</b> ${accountInfo.contact}<br>
		<b>Client Address:</b> ${accountInfo.addressLine}<br>
		<b>City:</b> ${accountInfo.city}<br>
		<b>Province:</b> ${accountInfo.province}<br>
		<b>Postal Code:</b> ${accountInfo.postalCode}<br>
		<b>Registration Date:</b> ${accountInfo.registrationDate}<br>
		<b>Account Status:</b> ${accountInfo.accountStatus}<br>

</body>

</html>