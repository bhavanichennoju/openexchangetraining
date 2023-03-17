package com.exception;

public class Student{
	String name;
	String location;
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", location=" + location + "]";
	}
	public Student() {
		super();
	}
	public Student(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location; 
	}
		
	
}
