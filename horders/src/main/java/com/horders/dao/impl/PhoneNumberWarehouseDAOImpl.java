package com.horders.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.horders.dao.PhoneNumberWarehouseDAO;
import com.horders.model.PhoneNumberWarehouse;

@Repository("phoneNumberWarehouseDAO")
public class PhoneNumberWarehouseDAOImpl implements PhoneNumberWarehouseDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public void persistPhoneNumber(PhoneNumberWarehouse phoneNumberWarehouse) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(phoneNumberWarehouse);
	}

}
