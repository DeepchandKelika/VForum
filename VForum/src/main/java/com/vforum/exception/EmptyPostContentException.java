package com.vforum.exception;

public class EmptyPostContentException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message = "";
	public EmptyPostContentException(final String exceptionMessage) {
		this.message = exceptionMessage;
	}
	
	final public String toString() {
		return message;
	}
}
