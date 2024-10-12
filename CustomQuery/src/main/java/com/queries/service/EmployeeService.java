package com.queries.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.queries.entity.Employee;
import com.queries.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getEmployeesByDepartment(String department) {
		return employeeRepository.findByDepartment(department);
	}
}
