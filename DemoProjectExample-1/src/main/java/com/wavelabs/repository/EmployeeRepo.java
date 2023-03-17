package com.wavelabs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.wavelabs.model.Employee;

@Repository
public class EmployeeRepo {

	List<Employee> listAll = StaticData.lists();

	public Employee addEmployee(Employee employee) {
		Employee newEmployee = new Employee();
		newEmployee.setId(employee.getId());
		newEmployee.setCreatedAt(employee.getCreatedAt());
		newEmployee.setEmployeeName(employee.getEmployeeName());
		newEmployee.setAge(employee.getAge());
		newEmployee.setMobileNumber(employee.getMobileNumber());
		newEmployee.setAddress(employee.getAddress());
		newEmployee.setSalary(employee.getSalary());
		newEmployee.setStatus(employee.getStatus());
		return newEmployee;
	}

	public Employee getEmployeeById(int id) {
		return listAll.stream().filter(x -> (x.getId() == id)).findFirst().get();

	}

	public List<Employee> getEmployeeInActive() {
		return listAll.stream().filter(Employee -> (Employee.getStatus() == "Active")).collect(Collectors.toList());

	}

	public List<Employee> getEmployeeInActive(int age) {
		return listAll.stream().filter(Employee -> (Employee.getStatus() == "Active" && Employee.getAge() == age))
				.collect(Collectors.toList());
	}

	public List<Employee> listOfEmployees() {
		return listAll;
	}

	public List<Employee> deleteEmployee(int id) {
		listAll.removeIf(x -> (x.getId() == id));

		return listAll;
	}

}
