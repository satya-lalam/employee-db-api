package com.firm.employeedbapi.service;

import org.springframework.stereotype.Service;

import com.firm.employeedbapi.beans.Employee;
import com.firm.employeedbapi.repositories.EmployeeRepo;

@Service
public class EmployeeService {
	private EmployeeRepo employeeRepo;
	
	public Employee persistEmployee(Employee employee){
		
		return employeeRepo.save(employee);
	}

}
