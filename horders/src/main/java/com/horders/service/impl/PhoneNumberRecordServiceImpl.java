package com.horders.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.horders.dao.PhoneNumberRecordDAO;
import com.horders.model.PhoneNumberRecord;
import com.horders.service.PhoneNumberRecordService;

@Service("phoneNumberRecordService")
public class PhoneNumberRecordServiceImpl implements PhoneNumberRecordService {

	@Autowired
	PhoneNumberRecordDAO phoneNumberRecordDAO;
	
	@Transactional
	public void persistPhoneNumberRecord(PhoneNumberRecord phoneNumberRecord) {
		// TODO Auto-generated method stub
		phoneNumberRecordDAO.persistPhoneNumberRecord(phoneNumberRecord);
	}

}
