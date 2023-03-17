package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainProgram {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		Employee e1=new Employee("bhavani","Hr","hyderabad");
		Employee e2=new Employee("ramya","Finance","Bombay");
		Employee e3=new Employee("pinky","Hr","Delhi");
		list.add(e1);list.add(e2);list.add(e3);
		Collections.sort(list);
		System.out.println(list);
		
		//Sort employeeList by employee name
		Collections.sort(list, new Employee.NameSort());
		System.out.println(list);
		//Sort employeeList by dept name
		Collections.sort(list, new Employee.DeptNameSort());
		System.out.println(list);
	}

}
