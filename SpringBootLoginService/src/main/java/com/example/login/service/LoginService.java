package com.example.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.repository.LoginDbRepo;

@Service
public class LoginService {
	
	@Autowired
	public LoginDbRepo loginRepo;
	
	//service not required for login
	//will be part of controller.

}
