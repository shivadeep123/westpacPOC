package com.example.login.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

import com.example.login.response.JasonResponse;

@Entity
@Table(name="logindetails")
public class Login {
	
@Id
@Column(name="id")
@GeneratedValue(strategy=GenerationType.AUTO)

	private int id;

	@Column(name="username")
	private String username;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="isActive", nullable=true)
	private boolean isActive;
	
	@Transient 
	private JasonResponse object;
	
	public Login() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
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
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public JasonResponse getObject() {
		return object;
	}

	public void setObject(JasonResponse object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", isActive=" + isActive + "]";
	}
	
	
	public Login(int id, String username, String email, String password, boolean isActive) {
		//super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
	}
	
	
}
