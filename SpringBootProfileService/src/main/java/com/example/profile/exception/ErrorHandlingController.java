package com.example.profile.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//import com.example.demo.response.JasonResponse;

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
		e.setCode(51);
		e.setMessage("You cannot delete active user.");
		e.setType("Active_User");
		throw e;

	}

	public void throwNoUserException() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(52);
		e.setMessage("Profile details- Email not found.");
		e.setType("User_Details_Email_NotFound.");
		throw e;

	}
	
	public void throwMailNotRegisteredException() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(53);
		e.setMessage("Email received for update profile is notfound.");
		e.setType("User_Details_Email_NotFound.");
		throw e;

	}
	
	public void throwEmailEmptyException() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(54);
		e.setMessage("Profile Details-Email/firstName cannot be empty.");
		e.setType("User_Email_Empty.");
		throw e;

	}
	public void throwMobileNoEmptyException() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(55);
		e.setMessage("Profile Details-MobileNo cannot be empty.");
		//e.setType("User_Email_NotFound.");
		throw e;

	}
	
	public void throwEmailRegisteredException() throws CustomException {
		CustomException e = new CustomException();
		e.setCode(56);
		e.setMessage("Profile Details-Email already Exists.");
		//e.setType("User_Email_NotFound.");
		throw e;

	}

}
