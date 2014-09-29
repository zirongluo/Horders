package com.horders.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.horders.dao.UserDao;
import com.horders.model.UserInfo;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
    protected SessionFactory sessionFactory;
	public UserInfo findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserInfo findByLoginName(String loginName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveOrUpdate(UserInfo user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(user);
	}

}
