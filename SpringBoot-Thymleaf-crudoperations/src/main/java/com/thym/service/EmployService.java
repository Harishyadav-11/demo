package com.thym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.thym.model.Employee;
import com.thym.repo.EmployeeRepository;

public class EmployService implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}

	

	



}
