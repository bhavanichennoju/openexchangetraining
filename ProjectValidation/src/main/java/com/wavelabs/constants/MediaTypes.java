package com.wavelabs.constants;

public enum MediaTypes {
	
	USER_PROFILE(0);
	
	private int mediaType;

	private MediaTypes(int mediaType) {
		this.mediaType = mediaType;
	}

	public int getMediaType() {
		return mediaType;
	}

}
