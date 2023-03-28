package com.vforum.exception;

public class InvalidEmailException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String message;
	public InvalidEmailException(final String exceptionMessage) {
		this.message = exceptionMessage;
	}
	
	final public String toString() {
		return message;
	}
	
	
}
