package com.vforum.exception;

public class InvalidPasswordException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;
	public InvalidPasswordException(final String exceptionMessage)	{
		this.message = exceptionMessage;
	}
		
	final public String toString() {
		return message;
	}
}
