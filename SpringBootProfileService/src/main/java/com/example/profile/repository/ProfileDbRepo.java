package com.example.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.profile.bean.Profile;

@Repository
public interface ProfileDbRepo extends JpaRepository<Profile, String> {

}
