package com.example.test.multipart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.multipart.entity.Employee;
import com.example.test.multipart.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	private Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@PostMapping(value = "/saveemp")
	public ResponseEntity <Employee> createEmployee(@RequestBody  Employee emp
			) {
		this.logger.info("empData:{} ",emp);
		
		return new ResponseEntity<Employee>(service.saveEmployee(emp), HttpStatus.CREATED) ;
	}

}
