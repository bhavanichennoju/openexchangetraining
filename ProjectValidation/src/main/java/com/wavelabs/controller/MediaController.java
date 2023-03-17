package com.wavelabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.wavelabs.constants.MediaTypes;
import com.wavelabs.request.ProfileMediaRequest;
import com.wavelabs.response.Response;
import com.wavelabs.service.MediaService;

@RestController
public class MediaController {

	@Autowired
	MediaService mediaService;

	@PostMapping(value = "/uploadMedia")
	public ResponseEntity<Response> uploadMedia(@RequestPart("file") MultipartFile file,
			@RequestParam(name = "mediaType") MediaTypes mediaType,
			@RequestParam(name = "userId", required = true) Long userId) {
		ProfileMediaRequest profileMediaRequest = new ProfileMediaRequest();
		profileMediaRequest.setFile(file);
		profileMediaRequest.setMediaType(mediaType);
		profileMediaRequest.setUserId(userId);
		return ResponseEntity.status(HttpStatus.OK).body(mediaService.uploadProfileMedia(profileMediaRequest));

	}

}
