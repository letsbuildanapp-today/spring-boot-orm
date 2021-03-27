package com.orm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orm.dao.EmployeeDAO;
import com.orm.model.Employee;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	public List<Employee> getAll(){
		return dao.fetchAllEmp();
		
	}
   public  int saveEmp(Employee emp) {
	   return dao.saveAnEmployee(emp);
   }
}
