package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.registration.RegistrationInfo;

public class RegistrationDAO {
	
	Connection dbConnection = null;
	String dbURL = "jdbc:mysql://localhost:3306/db_housekeeping";
	String dbUsername = "root";
	String dbPassword = "";
	
	String sqlStatement = "INSERT INTO adminsp "
			+ "(username, password, business_name, email, first_name, last_name, "
			+ "contact_number, address_line, city, province, postal_code, account_status)"
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public Connection connectToDB() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbConnection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dbConnection;
		
	}
	
	public void closeDBConnection() {
		
		try {
			if (dbConnection != null) {
				dbConnection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void registerAccountInfo(RegistrationInfo registrationInfo) {
		
		String Username = registrationInfo.getUsername();
		String Password = registrationInfo.getPassword();
		String Email = registrationInfo.getEmail();
		String Contact = registrationInfo.getContact();
		String BusinessName = registrationInfo.getBusinessName();
		String FirstName = registrationInfo.getFirstName();
		String LastName = registrationInfo.getLastName();
		String AddressLine = registrationInfo.getAddressLine();
		String City = registrationInfo.getCity();
		String Province = registrationInfo.getProvince();
		int postalCode = registrationInfo.getPostalCode();
		
		try {
			
			PreparedStatement pStmt = dbConnection.prepareStatement(sqlStatement);
			
			pStmt.setString(1, Username);
			pStmt.setString(2, Password);
			pStmt.setString(3, BusinessName);
			pStmt.setString(4, Email);
			pStmt.setString(5, FirstName);
			pStmt.setString(6, LastName);
			pStmt.setString(7, Contact);
			pStmt.setString(8, AddressLine);
			pStmt.setString(9, City);
			pStmt.setString(10, Province);
			pStmt.setInt(11, postalCode);
			pStmt.setString(12, "Pending");
			
			pStmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
