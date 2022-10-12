package com.nissan.service;

import java.util.List;

import com.nissan.model.Employee;

public interface IEmployeeService {
	//Get all Employees
	List<Employee> findAllEmployees();
	
	//Add an employee
	Employee addEmployee(Employee employee);
	
	//Update an employee
	Employee updateEmployee(Employee employee);
	
	//Delete an employee
	Employee deleteEmployee(Employee employee);
	
	//Search by phone 
	Employee searchByPhone(long phoneNumber);
	
}
