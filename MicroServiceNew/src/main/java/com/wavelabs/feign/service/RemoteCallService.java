package com.wavelabs.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wavelabs.feign.entity.User;

@FeignClient(url = "http://localhost:8082", name = "user-producer")
public interface RemoteCallService {
	
	//@RequestMapping(method=RequestMethod.POST, value="/user")
	//User getData(CreateUserRequest request);
	@RequestMapping(method=RequestMethod.GET, value="/hello")
	String getWelcome();

	
}