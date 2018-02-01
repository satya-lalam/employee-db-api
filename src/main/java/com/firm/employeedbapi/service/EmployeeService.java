package com.firm.employeedbapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firm.employeedbapi.beans.Employee;
import com.firm.employeedbapi.repositories.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee persistEmployee(Employee employee){
		
		return employeeRepo.save(employee);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}
	
	public void deleteEmployee(Employee employee){
		
		employeeRepo.delete(employee);;
	}

}
