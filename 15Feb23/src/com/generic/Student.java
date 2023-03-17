package com.generic;



public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int compareTo(Student student) {
		if (marks > student.marks) {
			return 1;
		} else if (marks < student.marks) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
