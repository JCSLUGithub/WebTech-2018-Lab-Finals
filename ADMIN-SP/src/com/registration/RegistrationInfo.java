package com.registration;

public class RegistrationInfo {

	private String Username;
	private String Password;
	private String Email;
	private String Contact;
	private String BusinessName;
	private String FirstName;
	private String LastName;
	private String AddressLine;
	private String City;
	private String Province;
	private int postalCode;
	
	public RegistrationInfo() {
	}
	
	public RegistrationInfo(
			String Username,
			String Password,
			String Email,
			String Contact,
			String BusinessName,
			String FirstName,
			String LastName,
			String AddressLine,
			String City,
			String Province,
			int postalCode) {
		
		this.Username = Username;
		this.Password = Password;
		this.Email = Email;
		this.Contact = Contact;
		this.BusinessName = BusinessName;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.AddressLine = AddressLine;
		this.City = City;
		this.Province = Province;
		this.postalCode = postalCode;
		
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
	
	public String getContact() {
		return Contact;
	}
	
	public void setContact(String Contact) {
		this.Contact = Contact;
	}

	public String getBusinessName() {
		return BusinessName;
	}
	
	public void setBusinessName(String BusinessName) {
		this.BusinessName = BusinessName;
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
	
}
