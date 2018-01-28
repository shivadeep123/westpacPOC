package com.example.resource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resource.bean.ResourceSkill;

	
	@Repository
	public interface ResourceSkillDbRepo extends JpaRepository<ResourceSkill, String> {

	}


