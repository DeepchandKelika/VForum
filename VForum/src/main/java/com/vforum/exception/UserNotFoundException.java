package com.vforum.exception;

public class UserNotFoundException  extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;
	public UserNotFoundException(final String exceptionMessage) {
		this.message = exceptionMessage;
	}
	
	final public String toString() {
		return message;
	}
}
