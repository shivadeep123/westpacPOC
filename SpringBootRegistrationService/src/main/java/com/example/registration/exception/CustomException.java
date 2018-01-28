package com.example.registration.exception;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
public class CustomException extends Exception {

	public static final long serialversionUID = 1L;

	private int code;
	private String message;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
