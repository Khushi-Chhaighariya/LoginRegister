package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.example.entity.Login;
import com.example.entity.Users;
import com.example.repository.UsersRepo;
import com.example.entity.Login;
import com.example.entity.Users;
import com.example.repository.UsersRepo;
@Service
public class UserService {
    
	@Autowired
	UsersRepo usersRepo;
	
	
	public String addUser(Users user) {
	    usersRepo.save(user);
	    return "User added successfully!";
	}

	
	public Boolean loginUser(Login login) {//login k under hai emai or password
		//users ka object create kr rhe
		 Optional<Users> user = usersRepo.findById(login.getUserId());
		if(user.isEmpty()) {
			return false;//agar null hai to v false hao or wrong id,pwd to v false otherwise true.
		}
		//2 users ka object create kr rhe
	Users user1 = user.get();
	if(!user1.getPassword().equals(login.getPassword())){
		return false;//jo password dala hai wo agar match nhi huaa to return false krega.
	}
	return true;
	
	}
	
}

/*
public Boolean loginUser(Login login) {
	//Long userId = Long.valueOf(login.getUserId()); // convert String to Long
    //Optional<Users> optionalUser = usersRepo.findById(login.getUserId());
 
    if (optionalUser.isEmpty()) {
        return false; // User not found
    }

    Users user = optionalUser.get();

    if (!user.getPassword().equals(login.getPassword())) {
        return false; // Password doesn't match
    }

    return true;
}
}*/