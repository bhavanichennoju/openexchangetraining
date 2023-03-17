package com.test;
public class Student {
    private String subject;
    private String name;
    private String city;
    private int age;
	public Student() {
		super();
	}
	public Student(String subject, String name,  String city, int age) {
		super();
		this.subject = subject;
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [subject=" + subject + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}