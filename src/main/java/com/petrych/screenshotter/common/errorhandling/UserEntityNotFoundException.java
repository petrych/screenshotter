package com.petrych.screenshotter.common.errorhandling;

public class UserEntityNotFoundException extends RuntimeException {
	
	public UserEntityNotFoundException(String message) {
		
		super(message);
	}
	
}
