package com.horders.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.horders.dao.TopUpRecordDAO;
import com.horders.model.TopUpRecord;

@Repository("topUpRecordDAO")
public class TopUpRecordDAOImpl implements TopUpRecordDAO {

	@Autowired
	SessionFactory sessionFactory;
		
	public void persistTopUpRecord(TopUpRecord topUpRecord) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(topUpRecord);
	}

}
