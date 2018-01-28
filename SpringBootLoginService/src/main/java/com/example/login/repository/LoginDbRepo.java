package com.example.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.login.bean.Login;

@Repository
public interface LoginDbRepo extends JpaRepository<Login, Integer>{
	

}
