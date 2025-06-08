package com.example.repository;

import java.util.Optional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, String> {

	//Optional<Users> findByEmail(String email);
	//Optional<Users> findById(String userId);
	//Optional<Users> findById(Long id);

	//Optional<Users> findById(String userId);

	//Optional<Users> findById(String userId);

	Optional<Users> findByEmail(String email);

}