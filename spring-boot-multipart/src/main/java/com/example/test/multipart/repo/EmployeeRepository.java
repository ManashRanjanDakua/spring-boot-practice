package com.example.test.multipart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.multipart.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
