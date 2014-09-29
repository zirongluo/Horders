package com.javacodegeeks.snippets.enterprise.service;

import com.horders.model.UserInfo;
import com.javacodegeeks.snippets.enterprise.model.Employee;

public interface UserInfoService {
	void persistEmployee(UserInfo employee);

	UserInfo findEmployeeById(String id);

	void updateEmployee(UserInfo employee);

	void deleteEmployee(UserInfo employee);
}
