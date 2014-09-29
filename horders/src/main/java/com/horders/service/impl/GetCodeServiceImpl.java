package com.horders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.horders.dao.GetCodeDAO;
import com.horders.model.PhoneNumberRecord;
import com.horders.model.PhoneNumberWarehouse;
import com.horders.model.VerificationCode;
import com.horders.service.GetCodeService;
import com.horders.service.VerificationCodeService;
import com.horders.utility.SpringUtil;

@Service("getCodeService")
public class GetCodeServiceImpl implements GetCodeService {
	@Autowired
	GetCodeDAO getCodeDAO;
	
	@Autowired
	VerificationCodeService verificationCodeService;
	
	@Transactional
	public List getAvailablePhoneNumber(VerificationCode verificationCode) {
		// TODO Auto-generated method stub
		String phoneNumber = "";
		List list =  getCodeDAO.getAvailablePhoneNumber(verificationCode.getSite());
		if(list.size() != 0 ){
			//response.set
			PhoneNumberWarehouse phoneNumberWarehouse = (PhoneNumberWarehouse) list.get(0);
			phoneNumber = phoneNumberWarehouse.getPhoneNumber();
			verificationCode.setToPhone(phoneNumber);
			verificationCodeService.persistVerificationCode(verificationCode);
		}
		return list;
	}


}
