package com.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orm.model.Employee;
import com.orm.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return service.getAll();
		
	}
	@PostMapping("/saveone")
	public int saveOneEmployee(@RequestBody Employee emp){
		return service.saveEmp(emp);
		
	}
	
	

}
