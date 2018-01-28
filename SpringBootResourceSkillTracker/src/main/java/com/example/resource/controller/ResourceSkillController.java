package com.example.resource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.resource.bean.ResourceSkill;
import com.example.resource.repository.ResourceSkillDbRepo;
import com.example.resource.response.JasonResponse;

@RestController
@RequestMapping("/resouceskilldetails")
@CrossOrigin(origins = "http://localhost:3000")
public class ResourceSkillController {
	
	@Autowired
	ResourceSkillDbRepo repo;

	
	@RequestMapping(value = "/skilltracker", method = RequestMethod.GET, headers = "Accept=application/json")
	public JasonResponse getProfileBaseSkills() throws Exception {
		List<ResourceSkill> resourceskills = repo.findAll();
		//to handle error scenario
/*		ErrorHandlingController et = new ErrorHandlingController();
		if (profiles == null || profiles.isEmpty()) {
			et.throwNoUserException();
			return new JasonResponse(profiles.size(), "ERROR", profiles);
		}*/
		 return new JasonResponse(resourceskills.size(), "SUCCESS", resourceskills);
	}
}
