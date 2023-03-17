package com.wavelabs.feign.service;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class CreateUserRequest {
	
	//@NotBlank(message = "firstName is mandatory")
	//@Pattern(message = "Provide valid firstName", regexp = "^[ A-Za-z]*$")
	private String firstName;

	//@NotBlank(message = "lastName is mandatory")
	//@Pattern(message = "Provide valid lastName", regexp = "^[ A-Za-z]*$")
	private String lastName;

	//@OptionalPattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	//		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message = "Invalid Email id")
	private String email;
	
	//@NotNull
	//@OptionalPattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=()])(?=\\S+$).{8,20}$", 
			// message = "Password must have atleast 1 Number,1 Uppercase character,1 Lowercase character,1 Special character and length btw 8 and 20")
	private String password;

//	@OptionalPattern(regexp = "^[7-9][0-9]{9}$", message = "mobile Number should 10 digits or starts with 7,8,9")
	private String mobileNumber;


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
	
	

}
