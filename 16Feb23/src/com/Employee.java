package com;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private String deptName;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Employee(String name, String deptName, String address) {
		super();
		this.name = name;
		this.deptName = deptName;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", deptName=" + deptName + ", address=" + address + "]";
	}
	//overriding compareTo() method
	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
	}
	public static class NameSort implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	
	//sort employee by deptName
	public static class DeptNameSort implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getDeptName().compareTo(o2.getDeptName());
		}
		
	}


}