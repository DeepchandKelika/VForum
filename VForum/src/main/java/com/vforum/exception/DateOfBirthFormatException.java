package com.vforum.exception;

public class DateOfBirthFormatException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;
	public DateOfBirthFormatException(final String exceptionMessage) {
		this.message = exceptionMessage;
	}
	
	final public String toString() {
		return message;
	}
	
}
