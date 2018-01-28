package com.example.profile.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.profile.bean.Profile;
import com.example.profile.exception.ErrorHandlingController;
import com.example.profile.repository.ProfileDbRepo;
import com.example.profile.response.JasonResponse;

@RestController
@RequestMapping("/profiledetails")
@CrossOrigin(origins = {"http://localhost:3000"},maxAge=3000)
public class ProfileController {
	
	@Autowired
	ProfileDbRepo repo;
	

	
	
	@RequestMapping(value = "/findallprofiles", method = RequestMethod.GET, headers = "Accept=application/json")
	public JasonResponse getProfiles() throws Exception {
		List<Profile> profiles = repo.findAll();
		ErrorHandlingController et = new ErrorHandlingController();
		if (profiles == null || profiles.isEmpty()) {
			et.throwNoUserException();
			return new JasonResponse(profiles.size(), "ERROR", profiles);
		}
		 return new JasonResponse(profiles.size(), "SUCCESS", profiles);
	}
	
	//to delete
	@CrossOrigin(origins = {"localhost:3000"})
	@RequestMapping(value = "/deleteprofile/{email:.+}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public ResponseEntity<Map> deleteProfile(@PathVariable(value = "email") String email) throws Exception{
		String empemail="";
		//Profile emp = repo.findOne(email);
		Map<Object, Object> responseusr = new HashMap<>();
		ErrorHandlingController et = new ErrorHandlingController();
		List<Profile> emp = repo.findAll();
	    if(emp == null) {
	        return ResponseEntity.notFound().build();
	    }
	    
		  for (int i = 0; i < emp.size(); i++) {

			empemail = emp.get(i).getEmail();
			System.out.println("empemail"+empemail);
			System.out.println("Email"+email);
			if(empemail.equalsIgnoreCase(email)){
				System.out.println("emp deleted");
				//repo.delete(emp.get(i));
				responseusr.put("Deleted", "True");
				System.out.println("Success>>>>>>" + responseusr);
			}
		  }
		  
		  
/*		  if(!(empemail.equalsIgnoreCase(email))){
				et.throwNoUserException();
				//return ResponseEntity.ok().build();
			}*/
		  return ResponseEntity.ok().body(responseusr);
		 // List<Profile> profiles = repo.findAll();
	   // return ResponseEntity.ok().body(profiles);
	}
	
	//to create new emp data
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/addprofile", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<List<Profile>> createNew(@Valid @RequestBody Profile emp) throws Exception{
		
		System.out.println("profile details to add"+emp);
		// to handle error scenario
		String email;
		ErrorHandlingController et = new ErrorHandlingController();
		List<Profile> empdetails =repo.findAll();
		
		if(emp.getEmail().isEmpty() || emp.getFirstName().isEmpty()){
			et.throwEmailEmptyException();
			return ResponseEntity.ok().build();
		}else if(emp.getMobileNo().isEmpty()){
			et.throwMobileNoEmptyException();
			return ResponseEntity.ok().build();
		}else{ 
			
			for (int i = 0; i < empdetails.size(); i++) {
				
				email=empdetails.get(i).getEmail();
			if (email.equalsIgnoreCase(emp.getEmail())) {
			et.throwEmailRegisteredException();
			return ResponseEntity.ok().build();
		}
		}
		}
				
	     repo.save(emp);
	     System.out.println("profile added");
	     List<Profile> newemp =repo.findAll();     
	     return ResponseEntity.ok(newemp);
	     
	    // return (ResponseEntity<List<Profile>>) repo.findAll();
	}
	
	
	@SuppressWarnings("rawtypes")
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/updateprofile/{email:.+}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public ResponseEntity<Map> updateProfile(@PathVariable(value = "email") String email ,@Valid @RequestBody Profile empDetails) throws Exception{
		
		String empemail;
		//Profile profile = null;
		Map<Object, Object> updatedusr = new HashMap<>();
		ErrorHandlingController et = new ErrorHandlingController();
		Profile emp = repo.findOne(email);
		
	    if(emp == null) {
	        return ResponseEntity.notFound().build(); // to change and add profile if no details are found.
	    }	
System.out.println("empdetails>>>"+empDetails+"emp>>>>>>"+emp);
			
			if(empDetails.getEmail().equalsIgnoreCase(email)){
				System.out.println("emp email found");
				emp.setEmail(empDetails.getEmail());
				emp.setFirstName(empDetails.getFirstName());				
				emp.setLastName(empDetails.getLastName());				
				emp.setMobileNo(empDetails.getMobileNo());				
				emp.setQualification(empDetails.getQualification());				
				emp.setReleaseDate(empDetails.getReleaseDate());				
				emp.setYearsOfExperience(empDetails.getYearsOfExperience());			
				
			   }else{
				
				et.throwMailNotRegisteredException();
				return ResponseEntity.ok().build();
			   }
		  System.out.println("profile>>>>>"+emp);
			 repo.save(emp);
			 updatedusr.put("Updated", "True");
			System.out.println("Success>>>>>>" + updatedusr);
		  return ResponseEntity.ok().body(updatedusr);
	    //List<Profile> updatedemp =repo.findAll();
		//return ResponseEntity.ok(updatedemp);
	}

}
