package com.vforum.exception;

public class PasswordNotMatchedException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String message;
	public PasswordNotMatchedException(final String exceptionMessage) {
		this.message = exceptionMessage;
	}
		
	final public String toString() {
		return message;
	}
}
