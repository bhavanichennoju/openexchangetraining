package com.wavelabs.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wavelabs.constants.Constants;
import com.wavelabs.entity.User;
import com.wavelabs.exception.RecordNotfoundException;
import com.wavelabs.exception.BadRequestException;
import com.wavelabs.repository.UserRepository;
import com.wavelabs.request.CreateUserRequest;
import com.wavelabs.response.Response;;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	
	public User createUser(CreateUserRequest request) {
		Optional<User> optionalUser = userRepo.findByEmail(request.getEmail());
		if (optionalUser.isPresent()) {
			throw new BadRequestException("exception");
		}
		Optional<User> emp = userRepo.findByMobileNumber(request.getMobileNumber());
		if (emp.isPresent()) {
			throw new BadRequestException(Constants.MOBILE_ALREADY_EXIST);
		}
		User user=new User();
		user=Mapper.createUser(request,user);
	
		userRepo.save(user);
		
		return user;
		
		
		
	}
		
	


}
