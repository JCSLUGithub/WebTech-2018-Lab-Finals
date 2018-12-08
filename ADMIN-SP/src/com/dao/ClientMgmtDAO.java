package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.accountmgmt.client.AccountInfo;

public class ClientMgmtDAO {

	Connection dbConnection = null;
	String dbURL = "jdbc:mysql://localhost:3306/db_housekeeping";
	String dbUsername = "root";
	String dbPassword = "";
	
	String sqlAccountList = "SELECT client_id, username, email, first_name, last_name, "
						+ "contact_number, registration_date, account_status FROM client";
	String sqlAccount = "SELECT * FROM client WHERE client_id = ?";
	String sqlActivate = "UPDATE client SET account_status = 'Activated' WHERE client_id = ?";
	String sqlSuspend = "UPDATE client SET account_status = 'Suspended' WHERE client_id = ?";
	String sqlDeactivate = "UPDATE client SET account_status = 'Deactivated' WHERE client_id = ?";
	String sqlDelete = "DELETE FROM client WHERE client_id = ?";
	
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
				account.setClientID(resultSet.getInt("client_id"));
				account.setUsername(resultSet.getString("username"));
				account.setEmail(resultSet.getString("email"));
				account.setFirstName(resultSet.getString("first_name"));
				account.setLastName(resultSet.getString("last_name"));
				account.setContact(resultSet.getString("contact_number"));
				account.setRegistrationDate(resultSet.getString("registration_date"));
				account.setAccountStatus(resultSet.getString("account_status"));
				accountList.add(account);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return accountList;
		
	}
	
	public AccountInfo getAccountInfo(Connection dbConnection, int accountID) throws SQLException {
		
		AccountInfo accountInfo;
		String Username;
		String Password;
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
				
				accountInfo = new AccountInfo(
									accountID,
									Username,
									Password,
									Email,
									FirstName,
									LastName,
									Contact,
									AddressLine,
									City,
									Province,
									postalCode,
									AccountStatus,
									RegistrationDate);
				
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
	
	public void declineAccount(Connection dbConnection, int accountID) throws SQLException {
		
		PreparedStatement pStmt = dbConnection.prepareStatement(sqlDelete);
		
		pStmt.setInt(1, accountID);
		
		pStmt.executeUpdate();
		
	}
	
}
