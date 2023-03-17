package com.test1;

public class Student {
	int rollNo;
	String className;
	String name;
	public Student() {
		super();
	}
	public Student(int rollNo, String className, String name) {
		super();
		this.rollNo = rollNo;
		this.className = className;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", className=" + className + ", name=" + name + "]";
	}
	
	
}
