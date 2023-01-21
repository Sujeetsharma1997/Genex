package com.genex.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genex.exception.UserException;
import com.genex.model.Users;
import com.genex.model.UsersDto;
import com.genex.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/user")
public class MyController {

	@Autowired
	private UserService us;
	
	@PostMapping("/register")
	public ResponseEntity<Users> createUsersHandler(@RequestBody Users users) throws UserException {
		
	Users u = us.createUsers(users);
		
	return new ResponseEntity<>(u, HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<Users> loginUsers(@RequestBody UsersDto udto) throws UserException{
		
		
	Users ur = 	us.loginUsers(udto);
	 return new ResponseEntity<Users>(ur , HttpStatus.OK);
		
		
	} 
	
	
}
