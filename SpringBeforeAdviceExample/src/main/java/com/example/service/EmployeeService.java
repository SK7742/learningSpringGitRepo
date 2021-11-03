package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Employee;

@Service
public class EmployeeService {
	public Employee createEmployee(String empId, String fname, String sname) {
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setFirstName(fname);
		employee.setSecondName(sname);
		return employee;
	}

	public void deleteEmployee(String empId) {
		
	}
}
