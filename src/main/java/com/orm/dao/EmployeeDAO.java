package com.orm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.orm.model.Employee;

@Repository
public class EmployeeDAO {
	@Autowired
	
	private SessionFactory factory;
	
	public List<Employee> fetchAllEmp(){
		Session ses=factory.openSession();
		List<Employee> employees=ses.createQuery("from Employee").list();
		return employees;
		
	}
	
	public int saveAnEmployee(Employee emp) {
		Session ses=factory.openSession();
		int res=(int) ses.save(emp);
		return res;
	}

}
