package com.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegistrationDAO;
import com.registration.RegistrationInfo;

@WebServlet("/Register")
public class Register extends HttpServlet {
	
	RegistrationInfo registrationInfo = new RegistrationInfo();
	RegistrationDAO registrationDAO = new RegistrationDAO();
	
	String Username;
	String Password;
	String Email;
	String Contact;
	String BusinessName;
	String FirstName;
	String LastName;
	String AddressLine;
	String City;
	String Province;
	int postalCode;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Username = request.getParameter("username");
		Password = request.getParameter("password");
		Email = request.getParameter("email");
		Contact = request.getParameter("contact");
		BusinessName = request.getParameter("spname");
		FirstName = request.getParameter("firstname");
		LastName = request.getParameter("lastname");
		AddressLine = request.getParameter("addressline");
		City = request.getParameter("city");
		Province = request.getParameter("province");
		postalCode = Integer.parseInt(request.getParameter("postcode"));
		
		registrationInfo.setUsername(Username);
		registrationInfo.setPassword(Password);
		registrationInfo.setEmail(Email);
		registrationInfo.setContact(Contact);
		registrationInfo.setBusinessName(BusinessName);
		registrationInfo.setFirstName(FirstName);
		registrationInfo.setLastName(LastName);
		registrationInfo.setAddressLine(AddressLine);
		registrationInfo.setCity(City);
		registrationInfo.setProvince(Province);
		registrationInfo.setPostalCode(postalCode);
		
		registrationDAO.connectToDB();
		registrationDAO.registerAccountInfo(registrationInfo);
		
	}

}
