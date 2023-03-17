package com.wavelabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wavelabs.model.Employee;
import com.wavelabs.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl employeeService;
	
	@PostMapping("/employees")
	public Employee createEmployee( @RequestBody Employee employee) {
	    return employeeService.addEmployee(employee);
	}

	@GetMapping("/find/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer id) {
		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/all")
	public List<Employee> getEmployeeInActive() {
		return employeeService.getEmployeeInActive();
	}

	@GetMapping("/employeeActive/age")
	public List<Employee> getEmployeeInActive(int age) {
		return employeeService.getEmployeeInActive(age);
	}

	@GetMapping(path = "/employees")
	public ResponseEntity<List<Employee>> allEmployees() {
		List<Employee> list = employeeService.listOfEmployees();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	@DeleteMapping(path="/delete/{id}")
    public List<Employee>  deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }

}
