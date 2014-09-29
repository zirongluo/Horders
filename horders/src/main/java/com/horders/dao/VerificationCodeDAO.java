package com.horders.dao;

import java.util.List;

import com.horders.model.VerificationCode;

public interface VerificationCodeDAO {
	
	void persistVerificationCode(VerificationCode verificationCode);
	
	public int updateVerificationCodeById(long  id , String text);
	
	public int updateVerificationCodeByPhoneNumberAndSite(String phoneNumber, String site, String text);

	public List getPhoneNumberLastRecord(String phoneNumber);
	
	public List getVerificationCode(String phoneNum, String project);
}
