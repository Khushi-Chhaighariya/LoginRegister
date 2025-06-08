package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.Login;
import com.example.entity.Users;
import com.example.service.UserService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
	private UserService userService;
    //user register krega waise hi uska data aa jayga db main
	//iski requestbody main to 3 chije aa rhi name,email,pwd
    @PostMapping("/addUser")
	public String addUser(@RequestBody Users user) {
    	return userService.addUser(user);
		
	}
	//login k liya ye hai ki jo uername password hai user ka to ckeck krna db main ki ye entey hai ya nhi hai ahai to login otherwise not then we show popup ki phale regester kro..
    //request aaygi uer se to post
	@PostMapping("/loginUser")//Login login main mention krna hai jo request hai wo kismain lena hai RequestBody se.
	public Boolean loginUser(@RequestBody Login login) {
		//ab service main authenticate krne bhaj dege ki jo email or password hai wo authenticate krti hai ya nhi.
		return userService.loginUser(login);
	}
	
	
	
}
