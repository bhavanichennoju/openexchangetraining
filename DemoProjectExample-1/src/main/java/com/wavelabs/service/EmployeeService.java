package com.wavelabs.service;

import java.util.List;

import com.wavelabs.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee getEmployeeById(int id);

	public List<Employee> getEmployeeInActive();

	public List<Employee> getEmployeeInActive(int age);

	public List<Employee> listOfEmployees();

	public List<Employee> deleteEmployee(int id);
}
