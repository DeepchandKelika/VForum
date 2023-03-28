package com.vforum.model;

public class UserModel {
		
	private String emailId = "", password = "";
	private int userId = 0;
	private String userName = "";
	private String phoneNumber = "";
	private String designation = "";
	private String location = "";
	private String dob = "";
	private String userType="";
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	final public String getEmailId() {
		return emailId;
	}

	final public void setEmailId(final String userEmailId) {
		this.emailId = userEmailId;
	}

	final public String getPassword() {
		return password;
	}

	final public void setPassword(final String userPassword) {
		this.password = userPassword;
	}

	final public int getUserId() {
		return userId;
	}

	final public void setUserId(final int userID) {
		this.userId = userID;
	}

	final public String getUserName() {
		return userName;
	}

	final public void setUserName(final String firstNameLastName) {
		this.userName = firstNameLastName;
	}

	final public String getPhoneNumber() {
		return phoneNumber;
	}

	final public void setPhoneNumber(final String userPhoneNumber) {
		this.phoneNumber = userPhoneNumber;
	}

	final public String getDesignation() {
		return designation;
	}

	final public void setDesignation(final String userDesignation) {
		this.designation = userDesignation;
	}

	final public String getLocation() {
		return location;
	}

	final public void setLocation(final String userLocation) {
		this.location = userLocation;
	}

	final public String getDob() {
		return dob;
	}

	final public void setDob(final String userDOB) {
		this.dob = userDOB;
	}

}
