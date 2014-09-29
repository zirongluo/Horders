package com.javacodegeeks.snippets.enterprise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacodegeeks.snippets.enterprise.dao.EmployeeDAO;
import com.javacodegeeks.snippets.enterprise.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDAO userInfoDAO;
	

	@Transactional
	public void persistEmployee(Employee employee) {
		userInfoDAO.persistEmployee(employee);
		
	}


	@Transactional
	public void updateEmployee(Employee employee) {
		userInfoDAO.updateEmployee(employee);
		
	}

	@Transactional
	public Employee findEmployeeById(String id) {
		return userInfoDAO.findEmployeeById(id);
	}


	@Transactional
	public void deleteEmployee(Employee employee) {
		userInfoDAO.deleteEmployee(employee);
		
	}

}
