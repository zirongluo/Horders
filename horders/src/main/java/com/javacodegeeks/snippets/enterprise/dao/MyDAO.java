package com.javacodegeeks.snippets.enterprise.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.horders.model.My;
import com.horders.model.UserInfo;

@Repository("myDAO")
public class MyDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void persistMy(My my) {
		sessionFactory.getCurrentSession().persist(my);
	}
}
