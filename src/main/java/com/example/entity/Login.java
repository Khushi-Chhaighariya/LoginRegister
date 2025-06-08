package com.example.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Login {

	public Login() {//default constractor
		
	}
	public Login(String userId, String password) {
		super();
		this.email = userId;
		this.password = password;
	}
	
	private String email;
	private String password;
	public String getUserId() {
		return email;
	}
	public void setUserId(String userId) {
		this.email = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
