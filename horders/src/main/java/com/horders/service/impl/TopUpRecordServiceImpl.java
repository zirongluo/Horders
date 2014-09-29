package com.horders.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.horders.dao.TopUpRecordDAO;
import com.horders.model.TopUpRecord;
import com.horders.service.TopUpRecordService;

@Service("topUpRecordService")
public class TopUpRecordServiceImpl implements TopUpRecordService {

	@Autowired
	TopUpRecordDAO topUpRecordDAO;
	
	@Transactional
	public void persistTopUpRecord(TopUpRecord topUpRecord) {
		// TODO Auto-generated method stub
		topUpRecordDAO.persistTopUpRecord(topUpRecord);
	}

}
