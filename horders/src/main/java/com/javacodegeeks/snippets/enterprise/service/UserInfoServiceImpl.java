package com.javacodegeeks.snippets.enterprise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.horders.model.UserInfo;
import com.javacodegeeks.snippets.enterprise.dao.EmployeeDAO;
import com.javacodegeeks.snippets.enterprise.dao.UserInfoDAO;
import com.javacodegeeks.snippets.enterprise.model.Employee;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoDAO employeeDAO;
	

	@Transactional
	public void persistEmployee(UserInfo employee) {
		employeeDAO.persistEmployee(employee);
		
	}


	@Transactional
	public void updateEmployee(UserInfo employee) {
		employeeDAO.updateEmployee(employee);
		
	}

	@Transactional
	public UserInfo findEmployeeById(String id) {
		return employeeDAO.findEmployeeById(id);
	}


	@Transactional
	public void deleteEmployee(UserInfo employee) {
		employeeDAO.deleteEmployee(employee);
		
	}
}
