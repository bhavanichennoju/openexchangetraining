package com.wavelabs.model;
//extends--inheritance concept
public class Employee extends CommonEntity {
	//To achieve encapulation
	/*
	 * 1.declare the variables of class as private
	 * 2.provide public getter and setter methods to modify and view the variables values
	 */
	private String employeeName;
	private String mobileNumber;
	private String address;
	private int age;
	private double salary;
	private String status;

	public String getEmployeeName() {
		return employeeName;
	}
	public Employee setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
		return this;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public Employee setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public Employee setAddress(String address) {
		this.address = address;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Employee setAge(int age) {
		this.age = age;
		return this;
	}
	public double getSalary() {
		return salary;
	}
	public Employee setSalary(double salary) {
		this.salary = salary;
		return this;
	}
	public String getStatus() {
		return status;
	}
	public Employee setStatus(String status) {
		this.status = status;
		return this;
	}

	

}
