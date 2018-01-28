package com.example.login.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.login.bean.Login;
import com.example.login.exception.ErrorHandlingController;
import com.example.login.repository.LoginDbRepo;
import com.example.login.response.JasonResponse;

@RestController
@RequestMapping("/userdetails")
@CrossOrigin(origins = "http://localhost:3000")

public class LoginController<Profile> {
	
	@Autowired
	public LoginDbRepo repo;
	
	@Autowired
	public RestTemplate restTemplate;
	
	@SuppressWarnings("rawtypes")
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST, headers = "Accept=application/json")
	public JasonResponse createNew(@Valid @RequestBody Login usr) throws Exception {
		System.out.println("usr object >>>>>>" + usr.toString());
		String email;
		String password;
		String userName;
		
		Map<Object, Object> responseusr = new HashMap<>();
		List<Login> users = (List<Login>) repo.findAll();
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
					return new JasonResponse(users.size(), "ERROR", users);
				} else if (password.equalsIgnoreCase(usr.getPassword())) {
					responseusr.put("Authenticated", users.get(i).isActive());
					System.out.println("Success>>>>>>" + responseusr);
//users.addAll(0,(Collection<? extends Login>) responseusr);
					JasonResponse  profiles =restTemplate.getForObject("http://localhost:9005/profiledetails/findallprofiles", JasonResponse.class);
					System.out.println("profile object>>>>>>>"+profiles);
					profiles.setObjectType("ProfileDetails");
					
					return profiles;
				}
			}
		}

		System.out.println("usr object " + usr.toString());
		// repo.save(usr);
		et.throwEmailNotRegistered();
		return new JasonResponse(users.size(), "ERROR", users);
	}
	
	// to delete user details
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public JasonResponse deleteUser(@PathVariable(value = "id") int Id) throws Exception {

		ErrorHandlingController et = new ErrorHandlingController();
		Login usr = repo.findOne(Id);
		if (usr == null) {
			et.throwNoUserException();
		}

		if (!(usr.isActive())) {
			repo.delete(usr);
			//return ResponseEntity.ok().body(usr);
			return new JasonResponse(usr.getId(), "SUCCESS", (List<? extends Object>) usr);
		} else {

			et.throwActiveUserException();
			//return ResponseEntity.ok().build();
			return new JasonResponse(usr.getId(), "ERROR", (List<? extends Object>) usr);
		}
	}
	
}
