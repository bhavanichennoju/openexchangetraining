package com.wavelabs.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wavelabs.feign.service.FeignService;


@RestController
@RequestMapping("/api")
public class FeignController {
	
	@Autowired
	FeignService service;
	
	@GetMapping(path="/feign/hello")
	public String getWelcome() {
		return service.hello();
	}

}
