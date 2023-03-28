package com.vforum.exception;

public class PhoneNumberFormatException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;
	public PhoneNumberFormatException(final String exceptionMessage) {
		this.message = exceptionMessage;
	}
	
	final public String toString() {
		return message;
	}	
}
