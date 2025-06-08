package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//ye register k liya jab user register krega tb.
@Entity
@Table(name="users")
public class Users {
	public Users(){
		//without parameter pass kiya hue ish entity k parameter ko ye problum na kre.
	}

	public Users(Long id, String name, String email, String password) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
	}
    
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	//private int id;
    
	private String email;
	private String name;
	private String password;

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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



	public Users get() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
