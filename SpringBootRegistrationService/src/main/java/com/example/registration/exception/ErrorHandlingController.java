package com.example.registration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//import com.example.login.response.JasonResponse;

@ControllerAdvice
public class ErrorHandlingController {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> generalException(Exception ex) {

		ExceptionResponse er = new ExceptionResponse();
		er.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		er.setDescription(ex.getMessage());
		er.setType(er.getType());
		System.out.println(ex);
		return new ResponseEntity<ExceptionResponse>(er, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ExceptionResponse> customException(CustomException e) {

		ExceptionResponse er1 = new ExceptionResponse();
		er1.setCode(e.getCode());
		er1.setDescription(e.getMessage());
		er1.setType(e.getType());
		System.out.println("er1>>>"+er1);
		return new ResponseEntity<ExceptionResponse>(er1, HttpStatus.BAD_REQUEST);
	}

	public void throwGeneralException() throws Exception {
		Exception e = new Exception("General Exception Occured");
		throw e;

	}

	public void throwActiveUserException() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(10);
		e.setMessage("You cannot delete active user.");
		e.setType("Active_User");
		throw e;

	}

	public void throwNoUserException() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(20);
		e.setMessage("User details are not found.");
		throw e;

	}

	public void throwUserNameEmailException() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(70);
		e.setMessage("UserName/E-mail already Registered.");
		throw e;

	}
	public void throwUserNameEmptyException() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(80);
		e.setMessage("UserName/Firstname cannot be empty.");
		throw e;

	}
	
	public void throwEmailEmptyException() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(80);
		e.setMessage("Email/Password cannot be empty.");
		throw e;

	}
	
	public void throwEmailNotRegistered() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(30);
		e.setMessage("User Not Registered." + "please signup and register.");
		e.setType("user-doesnt-exist");
		throw e;

	}

	public void throwDateofBirth() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(40);
		e.setMessage("Date of Birth should not be more than currentdate.");
		throw e;

	}

	public void throwIncorrectPassword() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(50);
		e.setMessage("Incorrect password.Please re-enter.");
		e.setType("password-wrong");
		throw e;

	}

	public void throwInvalidInput() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(60);
		e.setMessage("Invalid Input Key.");
		throw e;

	}
}
