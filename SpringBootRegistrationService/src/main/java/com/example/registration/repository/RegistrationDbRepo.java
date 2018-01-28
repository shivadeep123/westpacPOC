package com.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.bean.Registration;


	@Repository
	public interface RegistrationDbRepo extends JpaRepository<Registration, Integer>{
		

	}


