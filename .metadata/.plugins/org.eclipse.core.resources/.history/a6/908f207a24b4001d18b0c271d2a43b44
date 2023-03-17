package com.wavelabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.wavelabs.entity.User;
import com.wavelabs.request.CreateUserRequest;
import com.wavelabs.response.Response;
import com.wavelabs.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;

	@PostMapping("/user")
	public User createUser( @RequestBody CreateUserRequest request) {
	    return service.createUser(request);
	}
	
	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}


}
