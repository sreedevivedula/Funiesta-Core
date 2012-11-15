package com.thoughtworks.funiesta.dao;

public class User {

	private String firstname;
	private String lastName;
	private String emailId;
	private String password;

	public User(String firstname, String lastName, String emailId,
			String password) {
		setFirstname(firstname);
		setLastName(lastName);
		setEmailId(emailId);
		setPassword(password);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
