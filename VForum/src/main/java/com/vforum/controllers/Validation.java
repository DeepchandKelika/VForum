package com.vforum.controllers;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validation {

	Pattern pattern;  
	Matcher matcher;
	
	final public boolean emailID(final String emailID) {
		pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@virtusa.com"); //[a-zA-Z0-9.-]+$");
		matcher = pattern.matcher(emailID);
		return matcher.matches();
	}
	
	final public boolean password(final String password) {
		pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
		matcher = pattern.matcher(password);
		return matcher.matches();
	}
	
	final public boolean nameCheck(final String name) {
		pattern = Pattern.compile("^[a-zA-Z]+$");
		matcher = pattern.matcher(name);
		return matcher.matches();
	}
	
	final public boolean dateOfBirth(final String dob) {
		pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19|20)\\d\\d$"); //^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$
		matcher = pattern.matcher(dob);
		return matcher.matches();
	}

	final public boolean phoneNumberFormat(final String phoneNumber) {
		pattern = Pattern.compile("(91)?[6-9][0-9]{9}");
		matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}

	final public boolean emptyPostContent(final String postContent) {
		pattern = Pattern.compile("^(?!\\s*$).+");
		matcher = pattern.matcher(postContent);
		return matcher.matches();
	}
}
