package com.vforum.exception;

public class InvalidNameFormatException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String message;
	public InvalidNameFormatException(final String exceptionMessage) {
		this.message = exceptionMessage;
	}
	
	final public String toString() {
		return message;
	}
	
}
