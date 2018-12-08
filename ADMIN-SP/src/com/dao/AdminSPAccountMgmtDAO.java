package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adminsp.accountmgmt.AccountInfo;

public class AdminSPAccountMgmtDAO {
	
	Connection dbConnection = null;
	String dbURL = "jdbc:mysql://localhost:3306/db_housekeeping";
	String dbUsername = "root";
	String dbPassword = "";
	
	String sqlAccountList = "SELECT adminsp_id, username, business_name, email,"
						+ "contact_number, registration_date, account_status FROM adminsp";
	String sqlAccount = "SELECT * FROM adminsp WHERE adminsp_id = ?";
	
	String sqlActivate = "UPDATE adminsp SET account_status = 'Activated' WHERE adminsp_id = ?";
	String sqlSuspend = "UPDATE adminsp SET account_status = 'Suspended' WHERE adminsp_id = ?";
	String sqlDeactivate = "UPDATE adminsp SET account_status = 'Deactivated' WHERE adminsp_id = ?";
	String sqlDecline = "DELETE FROM adminsp WHERE adminsp_id = ?";
	
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
	
	public List<AccountInfo> getAccountList(Connection dbConnection) throws SQLException {
		
		List<AccountInfo> accountList = new ArrayList<AccountInfo>();
		
		try {
			
			PreparedStatement pStmt = dbConnection.prepareStatement(sqlAccountList);
			ResultSet resultSet;
			
			resultSet = pStmt.executeQuery();
			
			while (resultSet.next()) {
				AccountInfo account = new AccountInfo();
				account.setAdminSPID(resultSet.getInt("adminsp_id"));
				account.setUsername(resultSet.getString("username"));
				account.setBusinessName(resultSet.getString("business_name"));
				account.setEmail(resultSet.getString("email"));
				account.setContact(resultSet.getString("contact_number"));
				account.setRegistrationDate(resultSet.getString("registration_date"));
				account.setAccountStatus(resultSet.getString("account_status"));
				accountList.add(account);
				System.out.println(resultSet.getInt("adminsp_id"));
			}
			
			System.out.println("End");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return accountList;
		
	}
	
	public AccountInfo getAccountInfo(Connection dbConnection, int accountID) throws SQLException {
		
		AccountInfo accountInfo;
		String Username;
		String Password;
		String BusinessName;
		String Email;
		String FirstName;
		String LastName;
		String Contact;
		String AddressLine;
		String City;
		String Province;
		String RegistrationDate;
		String AccountStatus;
		int postalCode;
		
		try {
			
			PreparedStatement pStmt = dbConnection.prepareStatement(sqlAccount);
			ResultSet resultSet;
			
			pStmt.setInt(1, accountID);
			
			resultSet = pStmt.executeQuery();
			
			while (resultSet.next()) {
				
				Username = resultSet.getString("username");
				Password = resultSet.getString("password");
				BusinessName = resultSet.getString("business_name");
				Email = resultSet.getString("email");
				FirstName = resultSet.getString("first_name");
				LastName = resultSet.getString("last_name");
				Contact = resultSet.getString("contact_number");
				AddressLine = resultSet.getString("address_line");
				City = resultSet.getString("city");
				Province = resultSet.getString("province");
				RegistrationDate = resultSet.getString("registration_date");
				AccountStatus = resultSet.getString("account_status");
				postalCode = resultSet.getInt("postal_code");
				
				accountInfo = new AccountInfo(accountID,
												Username,
												Password, 
												BusinessName,
												Email,
												FirstName,
												LastName,
												Contact,
												AddressLine,
												City,
												Province,
												postalCode,
												RegistrationDate,
												AccountStatus);
				return accountInfo;
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public void activateAccount(Connection dbConnection, int accountID) throws SQLException {
		
		PreparedStatement pStmt = dbConnection.prepareStatement(sqlActivate);
		
		pStmt.setInt(1, accountID);
		
		pStmt.executeUpdate();
		
	}
	
	public void suspendAccount(Connection dbConnection, int accountID) throws SQLException {
		
		PreparedStatement pStmt = dbConnection.prepareStatement(sqlSuspend);
		
		pStmt.setInt(1, accountID);
		
		pStmt.executeUpdate();
		
	}
	
	public void deactivateAccount(Connection dbConnection, int accountID) throws SQLException {
		
		PreparedStatement pStmt = dbConnection.prepareStatement(sqlDeactivate);
		
		pStmt.setInt(1, accountID);
		
		pStmt.executeUpdate();
		
	}
	
	public void deleteAccount(Connection dbConnection, int accountID) throws SQLException {
		
		PreparedStatement pStmt = dbConnection.prepareStatement(sqlDecline);
		
		pStmt.setInt(1, accountID);
		
		pStmt.executeUpdate();
		
	}

}
