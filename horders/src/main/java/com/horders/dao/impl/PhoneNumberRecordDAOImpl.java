package com.horders.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.horders.dao.PhoneNumberRecordDAO;
import com.horders.model.PhoneNumberRecord;

@Repository("phoneNumberRecordDAO")
public class PhoneNumberRecordDAOImpl implements PhoneNumberRecordDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public void persistPhoneNumberRecord(PhoneNumberRecord phoneNumberRecord) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(phoneNumberRecord);
	}

}
