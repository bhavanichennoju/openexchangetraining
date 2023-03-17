package com.wavelabs.model;

import java.time.LocalDateTime;

public class CommonEntity {
	private int id;
	private String createdAt;

	public int getId() {
		return id;
	}
	public CommonEntity setId(int id) {
		this.id = id;
		return this;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public CommonEntity setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}  
	
	 

}
