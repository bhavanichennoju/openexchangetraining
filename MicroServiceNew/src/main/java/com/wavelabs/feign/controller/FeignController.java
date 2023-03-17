package com.wavelabs.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wavelabs.feign.entity.User;
import com.wavelabs.feign.service.CreateUserRequest;
import com.wavelabs.feign.service.RemoteCallService;

@RestController
@RequestMapping("/api")
public class FeignController {
	
	@Autowired
	RemoteCallService service;
//	
//	@PostMapping(path ="/feign/create")
//	public User createUser(CreateUserRequest request) {
//		return service.getData(request);
//	}
	
	@GetMapping(path="/feign/hello")
	public String getWelcome() {
		return service.getWelcome();
	}

}