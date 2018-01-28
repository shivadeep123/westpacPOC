package com.example.app.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.app.bean.Application;
import com.example.app.repository.ApplicationDbRepo;
import com.example.app.response.JasonResponse;
//import com.example.profile.exception.ErrorHandlingController;

@RestController
@RequestMapping("/applicationdetails")
@CrossOrigin(origins = "http://localhost:3000")
public class ApplicationController {

	@Autowired
	ApplicationDbRepo repo;
	
	@Autowired
	public RestTemplate restTemplate;
	
	@ResponseBody
	@RequestMapping(value = "/baseskills", method = RequestMethod.GET, headers = "Accept=application/json")
	public JasonResponse getProfileBaseSkills() throws Exception {
		List<Application> profilebaseskills = repo.findAll();
		//to handle error scenario
/*		ErrorHandlingController et = new ErrorHandlingController();
		if (profiles == null || profiles.isEmpty()) {
			et.throwNoUserException();
			return new JasonResponse(profiles.size(), "ERROR", profiles);
		}*/
		
		////List  resourceSkills =restTemplate.getForObject("http://localhost:8086/resouceskilldetails/skilltracker", List.class);
		//System.out.println("resourceSkills object>>>>>>>"+resourceSkills);
		
		//profilebaseskills.addAll(resourceSkills);
		
		//System.out.println("resourceSkills profilebaseskills object>>>>>>>"+resourceSkills);
		
		 return new JasonResponse(profilebaseskills.size(), "SUCCESS", profilebaseskills);
	}
	
}
