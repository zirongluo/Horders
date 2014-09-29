package com.horders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.horders.dao.VerificationCodeDAO;
import com.horders.model.VerificationCode;
import com.horders.service.VerificationCodeService;

@Service("verificationCodeService")
public class VerificationCodeServiceImpl implements VerificationCodeService {

	@Autowired
	VerificationCodeDAO verificationCodeDAO;
	
	@Transactional
	public void persistVerificationCode(VerificationCode verificationCode) {
		// TODO Auto-generated method stub
		verificationCodeDAO.persistVerificationCode(verificationCode);
	}
	
	@Transactional
	public int updateVerificationCodeById(long id, String text) {
		// TODO Auto-generated method stub
		return verificationCodeDAO.updateVerificationCodeById(id, text);
	}

	@Transactional
	public int updateVerificationCodeByPhoneNumberAndSite(String phoneNumber,
			String site, String text) {
		// TODO Auto-generated method stub
		return verificationCodeDAO.updateVerificationCodeByPhoneNumberAndSite(phoneNumber, site, text);
	}

	@Transactional
	public List getPhoneNumberLastRecord(String phoneNumber) {
		// TODO Auto-generated method stub
		return verificationCodeDAO.getPhoneNumberLastRecord(phoneNumber);
	}
	
	@Transactional
	public List getVerificationCode(String phoneNum, String project){
		return verificationCodeDAO.getVerificationCode(phoneNum, project);
	}

}
