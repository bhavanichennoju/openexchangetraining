package com.wavelabs.service;

import java.time.LocalDateTime;

import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.wavelabs.constants.Constants;
import com.wavelabs.entity.ProfileMedia;
import com.wavelabs.exception.BadRequestException;
import com.wavelabs.response.Response;



public class ProfileMediaMapper {
	
	public static ProfileMedia getMediaDetails(MultipartFile file){

		ProfileMedia profileMedia = new ProfileMedia();
		try {
			profileMedia.setFile(file.getBytes());
		} catch (Exception e) {
			throw new BadRequestException(Constants.FAILED);

		}
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		profileMedia.setName(fileName);
		profileMedia.setFileExtension(fileName.substring(fileName.lastIndexOf(".") + 1));
		profileMedia.setSize(file.getSize());
		profileMedia.setCreatedAt(LocalDateTime.now());
		profileMedia.setUpdatedAt(LocalDateTime.now());

		return profileMedia;

	}

	public static Response profileMediaResponse(ProfileMedia profileMedia) {
		Response response = new Response();
		response.setId(profileMedia.getId());
		response.setStatus(Constants.SUCCESS);
		response.setMessage(Constants.PROFILE_UPLOADED);
		return response;
	}

}
