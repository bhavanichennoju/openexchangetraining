package com.wavelabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wavelabs.model.Employee;
import com.wavelabs.repository.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.addEmployee(employee);

		
	}
	@Override
	public Employee getEmployeeById(int id) {
		return employeeRepo.getEmployeeById(id);

		
	}
	/*
	 * overloading...samemethod...differ in parameter
	 */
	@Override
	public List<Employee> getEmployeeInActive() {
		return employeeRepo.getEmployeeInActive();

		
	}
	@Override
	public List<Employee> getEmployeeInActive(int age) {
		 return employeeRepo.getEmployeeInActive(age);
	}
	@Override
	public List<Employee> listOfEmployees() {
		return employeeRepo.listOfEmployees();

	}
	@Override
	public List<Employee> deleteEmployee(int id) {
		return employeeRepo.deleteEmployee(id);
	}
}
	