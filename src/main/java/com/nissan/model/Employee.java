package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblEmployee")
public class Employee {
	
	//Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	@Column(nullable = false, unique = false)
	private String empName;
	private String designation;
	private LocalDate dateOfJoning;
	
	@Column(nullable = false, unique = true)
	private long phoneNumber;
	
	@Column(nullable = true)
	private double salary;
	
	@JoinColumn(name="deptId")
	@ManyToOne
	private Department empDepartment;
	
	private boolean isActive;
	
	//Default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized constructor
	public Employee(int employeeId, String empName, String designation, LocalDate dateOfJoning, double salary, Department empDepartment, boolean isActive, long phoneNumber) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.designation = designation;
		this.dateOfJoning = dateOfJoning;
		this.salary = salary;
		this.empDepartment = empDepartment;
		this.isActive = isActive;
		this.phoneNumber = phoneNumber;
	}

	//Getters and setters
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public Department getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(Department empDepartment) {
		this.empDepartment = empDepartment;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDateOfJoning() {
		return dateOfJoning;
	}

	public void setDateOfJoning(LocalDate dateOfJoning) {
		this.dateOfJoning = dateOfJoning;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//Override toString
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + ", designation=" + designation
				+ ", dateOfJoning=" + dateOfJoning + ", salary=" + salary + ", empDepartment=" + empDepartment + "]";
	}

	
	
}
