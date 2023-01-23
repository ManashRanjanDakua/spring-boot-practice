package com.example.test.multipart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.multipart.entity.Employee;
import com.example.test.multipart.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;

	public Employee saveEmployee(Employee emp) {
		return repo.save(emp);
	}
	
	
	
	

}
