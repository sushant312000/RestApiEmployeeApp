package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Employee;
import com.nissan.service.IEmployeeService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class EmpController {

	// Field injection
	@Autowired
	IEmployeeService empService;

	// List all Employees
	@GetMapping("employees")
	public List<Employee> findAllEmployees() {
		return empService.findAllEmployees();
	}

	// Adding an employee
	@PostMapping("employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee _employee) {
		System.out.println("Inserting a record");
		return new ResponseEntity<Employee>(empService.addEmployee(_employee), HttpStatus.OK);
	}

	// Update an employee
	@PutMapping("employees")
	public Employee updateEmployee(@RequestBody Employee _employee) {
		System.out.println("Updating a record");
		empService.updateEmployee(_employee);
		return _employee;
	}
	
	//Delete an employee
	@PutMapping("employees/delete")
	public Employee deleteEmployee(@RequestBody Employee _employee) {
		System.out.println("Updating a record");
		empService.deleteEmployee(_employee);
		return _employee;
	}
	
	//Search by phone
	@GetMapping("employees/{phoneNumber}")
	public Employee searchEmployeeByPhoneNumber(@PathVariable long phoneNumber) {
		return empService.searchByPhone(phoneNumber);
		
	}
}
