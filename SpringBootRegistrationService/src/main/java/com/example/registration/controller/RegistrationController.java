package com.example.registration.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.bean.Registration;
import com.example.registration.exception.ErrorHandlingController;
import com.example.registration.repository.RegistrationDbRepo;

@RestController
@RequestMapping("/userdetails")
@CrossOrigin(origins = "http://localhost:3000")
public class RegistrationController {
	
	@Autowired
	public RegistrationDbRepo repo;
	
	@ResponseBody
	@RequestMapping(value="/registration", method=RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Registration> createRegistration (@RequestBody Registration usr) throws Exception{
		
		System.out.println("usr object >>>>>>" + usr.toString());
		String email;
		String password;
		String userName;
		Date lastLogged;
		
		
		ErrorHandlingController et = new ErrorHandlingController();
		
		if((usr.getFirstName().isEmpty()) || (usr.getUserName().isEmpty())){
			
			et.throwUserNameEmptyException();
			return ResponseEntity.ok().build();
		}
		
		if((usr.getPassword().isEmpty())|| (usr.getEmail().isEmpty())){
			
			et.throwEmailEmptyException();
			return ResponseEntity.ok().build();
		}

		List<Registration> regUsers = (List<Registration>) repo.findAll();
		System.out.println("regUsers findall object>>>>>>>>" + regUsers.toString());
		
	  if(regUsers.isEmpty()){		
			System.out.println("regusers is empty data can be saved ");
			repo.save(usr);
			return ResponseEntity.ok().body(usr);
	  }else{
		    for (int i = 0; i < regUsers.size(); i++) {

			email = regUsers.get(i).getEmail();
			password = regUsers.get(i).getPassword();
			userName= regUsers.get(i).getUserName();
			System.out.println("email>>" + email + "password>>>" + password);

			if (email.equalsIgnoreCase(usr.getEmail()) || userName.equalsIgnoreCase(usr.getUserName())) {
				et.throwUserNameEmailException();
				return ResponseEntity.ok().build();
			}
		}
		    System.out.println("usr object>>>> " + usr.toString());
		    lastLogged=usr.getLastLoggedin();
		    System.out.println("lastLogged>>>> " + lastLogged.toString());
		    if(lastLogged.toString().equalsIgnoreCase(" ") || lastLogged.toString().equalsIgnoreCase("null")){
		    	System.out.println("11223344");
		    	usr.setLastLoggedin(new Date());
		    	}
		        usr.setActive(true);
		        System.out.println("usr object after setting values>>>> " + usr.toString());
			 repo.save(usr);
				//et.throwEmailNotRegistered();
				return ResponseEntity.ok().body(usr);
		}

		

	}
	
	@SuppressWarnings("rawtypes")
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Map> createNew(@Valid @RequestBody Registration usr) throws Exception {
		System.out.println("usr object >>>>>>" + usr.toString());
		String email;
		String password;
		String userName;
		
		Map<Object, Object> responseusr = new HashMap<>();
		List<Registration> users = (List<Registration>) repo.findAll();
		System.out.println("users findall object>>>>>>>>" + users.toString());

		ErrorHandlingController et = new ErrorHandlingController();

		for (int i = 0; i < users.size(); i++) {

			email = users.get(i).getEmail();
			password = users.get(i).getPassword();
			userName= users.get(i).getUserName();
			System.out.println("email>>" + email + "password>>>" + password);

			if (email.equalsIgnoreCase(usr.getEmail()) || userName.equalsIgnoreCase(usr.getUserName())) {
				if (!password.equalsIgnoreCase(usr.getPassword())) {
					et.throwIncorrectPassword();
					return ResponseEntity.ok().build();
				} else if (password.equalsIgnoreCase(usr.getPassword())) {

					responseusr.put("Authenticated", users.get(i).isActive());
					System.out.println("Success>>>>>>" + responseusr);
					return ResponseEntity.ok().body(responseusr);
				}
			}
		}

		System.out.println("usr object " + usr.toString());
		// repo.save(usr);
		et.throwEmailNotRegistered();
		return ResponseEntity.ok().build();
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/findall", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public ResponseEntity findall() throws Exception {

		// return repo.findAll();
		List<Registration> userData = (List<Registration>) repo.findAll();
		ErrorHandlingController et = new ErrorHandlingController();
		if (userData.isEmpty()) {
			// return null;
			 et.throwNoUserException();
			 return ResponseEntity.ok().build();
		} else {

			return ResponseEntity.ok().body(userData);
		}

	}
	}
	


