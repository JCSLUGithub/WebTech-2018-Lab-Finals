package com.accountmgmt.client;

public class AccountInfo {
	
	private String Username;
	private String Password;
	private String Email;
	private String FirstName;
	private String LastName;
	private String Contact;
	private String AddressLine;
	private String City;
	private String Province;
	private String RegistrationDate;
	private String AccountStatus;
	private int clientID;
	private int postalCode;
	
	public AccountInfo() {
	}
	
	public AccountInfo(
			int clientID,
			String Username,
			String Email,
			String FirstName,
			String LastName,
			String Contact,
			String RegistrationDate,
			String AccountStatus) {
		
		this.clientID = clientID;
		this.Username = Username;
		this.Email = Email;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Contact = Contact;
		this.RegistrationDate = RegistrationDate;
		this.AccountStatus = AccountStatus;
		
	}
	
	public AccountInfo(
			int clientID,
			String Username,
			String Password,
			String Email,
			String FirstName,
			String LastName,
			String Contact,
			String AddressLine,
			String City,
			String Province,
			int postalCode,
			String RegistrationDate,
			String AccountStatus) {
		
		this.clientID = clientID;
		this.Username = Username;
		this.Password = Password;
		this.Email = Email;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Contact = Contact;
		this.AddressLine = AddressLine;
		this.City = City;
		this.Province = Province;
		this.postalCode = postalCode;
		this.RegistrationDate = RegistrationDate;
		this.AccountStatus = AccountStatus;
		
	}
	
	public int getClientID() {
		return clientID;
	}
	
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	
	public String getUsername() {
		return Username;
	}
	
	public void setUsername(String Username) {
		this.Username = Username;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public String getContact() {
		return Contact;
	}
	
	public void setContact(String Contact) {
		this.Contact = Contact;
	}
	
	public String getAddressLine() {
		return AddressLine;
	}
	
	public void setAddressLine(String AddressLine) {
		this.AddressLine = AddressLine;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String City) {
		this.City = City;
	}
	
	public String getProvince() {
		return Province;
	}
	
	public void setProvince(String Province) {
		this.Province = Province;
	}
	
	public int getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getRegistrationDate() {
		return RegistrationDate;
	}
	
	public void setRegistrationDate(String RegistrationDate) {
		this.RegistrationDate = RegistrationDate;
	}
	
	public String getAccountStatus() {
		return AccountStatus;
	}
	
	public void setAccountStatus(String AccountStatus) {
		this.AccountStatus = AccountStatus;
	}
	
}
