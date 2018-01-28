package com.example.profile.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profiledetails")
public class Profile {
	
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="project")
	private String project;
	
	@Column(name="releaseDate")
	private String releaseDate;
	
	@Column(name="primarySkills")
	private String primarySkills;
	
	@Column(name="secondarySkills")
	private String secondarySkills;
	
	@Column(name="yearsOfExperience")
	private int yearsOfExperience;
	
	@Column(name="trainings")
	private String trainings;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="mobileNo")
	private String mobileNo;
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPrimarySkills() {
		return primarySkills;
	}

	public void setPrimarySkills(String primarySkills) {
		this.primarySkills = primarySkills;
	}

	public String getsecondarySkills() {
		return secondarySkills;
	}

	public void setsecondarySkills(String secondarySkills) {
		this.secondarySkills = secondarySkills;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getTrainings() {
		return trainings;
	}

	public void setTrainings(String trainings) {
		this.trainings = trainings;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Profile [firstName=" + firstName + ", lastName=" + lastName + ", project=" + project + ", releaseDate="
				+ releaseDate + ", primarySkills=" + primarySkills + ", secondarySkills=" + secondarySkills
				+ ", yearsOfExperience=" + yearsOfExperience + ", trainings=" + trainings + ", qualification="
				+ qualification + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	
	

	public Profile() {
		//super();
	}

	public Profile(String email, String firstName, String lastName, String project, String releaseDate,
			String primarySkills, String secondarySkills, int yearsOfExperience, String trainings, String qualification,
			String mobileNo) {
		//super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.project = project;
		this.releaseDate = releaseDate;
		this.primarySkills = primarySkills;
		this.secondarySkills = secondarySkills;
		this.yearsOfExperience = yearsOfExperience;
		this.trainings = trainings;
		this.qualification = qualification;
		this.mobileNo = mobileNo;
	}		

}
