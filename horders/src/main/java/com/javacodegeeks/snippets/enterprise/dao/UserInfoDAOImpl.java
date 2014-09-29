package com.javacodegeeks.snippets.enterprise.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.horders.model.UserInfo;
import com.javacodegeeks.snippets.enterprise.model.Employee;

@Repository("userInfoDAO")
public class UserInfoDAOImpl implements UserInfoDAO {

	@Autowired
	private SessionFactory sessionFactory;


	public void persistEmployee(UserInfo employee) {
		sessionFactory.getCurrentSession().persist(employee);
	}


	public UserInfo findEmployeeById(String id) {
		return (UserInfo) sessionFactory.getCurrentSession().get(UserInfo.class, id);
	}


	public void updateEmployee(UserInfo employee) {
		sessionFactory.getCurrentSession().update(employee);

	}

	public void deleteEmployee(UserInfo employee) {
		sessionFactory.getCurrentSession().delete(employee);

	}
}
