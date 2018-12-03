package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthDAO {
	
	Connection dbConnection = null;
	String dbURL = "jdbc:mysql://localhost:3306/db_housekeeping";
	String dbUsername = "root";
	String dbPassword = "";
	
	String sqlStatement = "SELECT * FROM adminsp WHERE username = ? AND password = ?";
	
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
	
	public boolean checkCredentials(String username, String password) {
		
		try {
			
			PreparedStatement pStmt = dbConnection.prepareStatement(sqlStatement);
			ResultSet resultSet;
			
			pStmt.setString(1, username);
			pStmt.setString(2, password);
			
			resultSet = pStmt.executeQuery();
			
			if (resultSet.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

}
