package com.security.jwt.crud.exception;

public class StudentNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StudentNotFoundException(String message) {
		super(message);
	}
}
