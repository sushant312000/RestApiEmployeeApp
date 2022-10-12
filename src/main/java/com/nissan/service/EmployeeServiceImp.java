package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Employee;
import com.nissan.repo.IEmployeeRepo;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	IEmployeeRepo empRepo;

	@Override
	public List<Employee> findAllEmployees() {
		return (List<Employee>) empRepo.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public Employee searchByPhone(long phoneNumber) {
		Employee _employee = empRepo.searchByPhone(phoneNumber);
		if (phoneNumber == _employee.getPhoneNumber()) {
			return _employee;
		} else {
			return _employee;
		}
	}

}
