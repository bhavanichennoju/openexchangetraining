package com.wavelabs.service;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;

import com.wavelabs.entity.User;

import com.wavelabs.request.CreateUserRequest;
import com.wavelabs.response.Response;

public class Mapper {

	public static User createUser(CreateUserRequest request,User user) {
	//	BeanUtils.copyProperties(request, user);
		user.setCreatedAt(LocalDateTime.now());
		user.setUpdatedAt(LocalDateTime.now());
		user.setEmail(request.getEmail());
		user.setFirstName(request.getFirstName());
		user.setLastName(request.getLastName());
		user.setMobileNumber(request.getMobileNumber());
		//user.setStatus(Status.ACTIVE);
		return user;
		
		
	}
}
