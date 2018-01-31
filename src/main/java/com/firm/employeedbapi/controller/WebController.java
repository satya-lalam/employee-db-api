package com.firm.employeedbapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firm.employeedbapi.beans.Employee;
import com.firm.employeedbapi.service.EmployeeService;

@RestController
public class WebController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(path="/test", method=RequestMethod.GET)
	public String test(){
		return "test";
	}
	
	@RequestMapping(path="/persistemployee", method=RequestMethod.POST)
	public Employee persisitEmployee(@RequestBody Employee employee){
		System.out.println(employee);
		return employeeService.persistEmployee(employee);
	}
	
	@RequestMapping(path="/employees", method=RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}

}
