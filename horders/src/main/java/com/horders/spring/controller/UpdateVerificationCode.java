package com.horders.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.horders.model.VerificationCode;
import com.horders.service.VerificationCodeService;
import com.horders.spring.bean.GetCodeForm;
import com.horders.spring.bean.UpdateVerificationCodeForm;
import com.horders.utility.SpringUtil;

@Controller
public class UpdateVerificationCode {
	
	//url : http://localhost:8080/horders/update_verification_code?fromPhone=18767130034&toPhone=18767130034&text=ffffffffffffffffffff 
	@RequestMapping(value="update_verification_code")
	public void getPhoneNumber(HttpServletRequest request,HttpServletResponse response,UpdateVerificationCodeForm updateVerificationCodeForm){
		String fromPhone = updateVerificationCodeForm.getFromPhone();
		String toPhone = updateVerificationCodeForm.getToPhone();
		String text = updateVerificationCodeForm.getText();
		System.out.println(fromPhone+" "+toPhone+" "+text);
		VerificationCodeService  mydao = (VerificationCodeService) SpringUtil.getObject("verificationCodeService");
		VerificationCode verificationCode = null;
		List list = mydao.getPhoneNumberLastRecord(toPhone);
		if(list.size() != 0 ){
			verificationCode = (VerificationCode) list.get(0);
			System.out.println(verificationCode.getToPhone()+ " ");
		}
		if(verificationCode != null){
			mydao.updateVerificationCodeById(verificationCode.getUniqueId(), text);
		}
	}
}
