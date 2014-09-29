package com.horders.service;

import java.util.List;

import com.horders.model.VerificationCode;

public interface GetCodeService {
	List getAvailablePhoneNumber(VerificationCode verificationCode);
}
