package com.wavelabs.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.wavelabs.model.Employee;

class StaticData {
	static List<Employee> lists() {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		e1.setId(1).setCreatedAt("06/02/2023");
		e1.setEmployeeName("Ramesh").setMobileNumber("9898989891").setAddress("bhongir").setAge(25).setSalary(25000)
				.setStatus("Active");
		e5.setId(2).setCreatedAt("06/02/2023");
		e5.setEmployeeName("Suresh").setMobileNumber("9898989898").setAddress("bhongir").setAge(23).setSalary(23000)
				.setStatus("InActive");
		e2.setId(3).setCreatedAt("06/02/2023");
		e2.setEmployeeName("vikram").setMobileNumber("9898989892").setAddress("nacharam").setAge(25).setSalary(23000)
				.setStatus("Active");
		e3.setId(4).setCreatedAt("06/02/2023");
		e3.setEmployeeName("Suresh").setMobileNumber("9898989890").setAddress("Hitech").setAge(25).setSalary(25000)
				.setStatus("InActive");
		
		e4.setId(5).setCreatedAt("06/02/2023");
		e4.setEmployeeName("Tinku").setMobileNumber("9898989896").setAddress("madhupur").setAge(23).setSalary(23000)
				.setStatus("Active");
		 List<Employee> arraylist = new ArrayList<>();
		 arraylist.add(e1);arraylist.add(e2);
		 arraylist.add(e3);arraylist.add(e4);
		 arraylist.add(e5);
		return arraylist;
	}

}