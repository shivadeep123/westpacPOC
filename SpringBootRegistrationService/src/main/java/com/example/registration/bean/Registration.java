package com.example.registration.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="registrationdetails")
public class Registration {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="phoneNo")
	private String phoneNo;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pinCode")
	private int pinCode;
	
	@Column(name="dateOfBirth")
	private String dateOfBirth; //change to String
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="lastLoggedin")
	private Date lastLoggedin;
	
	@Column(name="isActive")
	private boolean isActive;
	
	public Registration() {
		
	}
	
	public Registration(String email, String password, String userName, String firstName, String lastName, String phoneNo,
			String street, String city, String state, int pinCode, String dateOfBirth, boolean isActive,String gender, Date lastLoggedin) {
		//super();
		this.email = email;
		this.password = password;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.dateOfBirth = dateOfBirth;
		this.isActive = isActive;
		this.gender= gender;
		this.lastLoggedin= lastLoggedin;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
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
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
		

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastLoggedin() {
		return lastLoggedin;
		//return new SimpleDateFormat("yyyy-MM-dd").format(lastLoggedin);
	}

	public void setLastLoggedin(Date lastLoggedin) {
		this.lastLoggedin = new Date(); //to change later
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", email=" + email + ", password=" + password + ", userName=" + userName
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", lastLoggedin=" + lastLoggedin + ", isActive=" + isActive + "]";
	}
	

}
