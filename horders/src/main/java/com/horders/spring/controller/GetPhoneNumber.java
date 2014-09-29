package com.horders.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JSpinner.ListEditor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.horders.model.PhoneNumberWarehouse;
import com.horders.model.VerificationCode;
import com.horders.service.GetCodeService;
import com.horders.service.VerificationCodeService;
import com.horders.service.WebsiteService;
import com.horders.spring.bean.GetCodeForm;
import com.horders.spring.bean.LoginForm;
import com.horders.utility.SpringUtil;

@Controller
public class GetPhoneNumber {

	@RequestMapping(value="get_phone_number")
	public void getPhoneNumber(HttpServletRequest request,HttpServletResponse response,GetCodeForm getCodeForm){
		String project = getCodeForm.getProject();
		//System.out.println(""+project);
		String phoneNumber = "no phone number available for profect : "+project;
		GetCodeService getCodeService = (GetCodeService) SpringUtil.getObject("getCodeService");


		WebsiteService websiteService = (WebsiteService)SpringUtil.getObject("websiteService");
		List websiteList = websiteService.getWebSiteInfo(project);
		if(websiteList.size() > 0){
			/////////////////////////
			VerificationCode verificationCode = new VerificationCode();
			verificationCode.setAccountId(123456);
			verificationCode.setOccurTime(System.currentTimeMillis());
			verificationCode.setSite(project);
			verificationCode.setFromPhone("18767130034");
			verificationCode.setToPhone("18767130034");
			verificationCode.setText("dsfffffffffffffffffffffffffdgffsdd");
			verificationCode.setIsSameText(0);
			/////////////////////////

			List list = getCodeService.getAvailablePhoneNumber(verificationCode);
			if(list.size() != 0 ){
				//response.set
				PhoneNumberWarehouse phoneNumberWarehouse = (PhoneNumberWarehouse) list.get(0);
				phoneNumber = phoneNumberWarehouse.getPhoneNumber();
			}
		}
		try {
			response.getWriter().write(phoneNumber);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping(value="get_verification_code")
	public void getVerificationCode(HttpServletRequest request,HttpServletResponse response,GetCodeForm getCodeForm){
		String project = getCodeForm.getProject();
		String num = getCodeForm.getNum();
		System.out.println(""+project+" "+num);
		String verification = "no verification code  available";
		VerificationCodeService verificationCodeService = (VerificationCodeService)SpringUtil.getObject("verificationCodeService");;
		//		String verification = "";
		//		GetCodeService getCodeService = (GetCodeService) SpringUtil.getObject("getCodeService");
		List list = verificationCodeService.getVerificationCode(num, project);
		if(list.size() != 0 ){
			//response.set
			VerificationCode verificationCode = (VerificationCode) list.get(0);
			verification = verificationCode.getText();
		}
		try {
			response.getWriter().write(verification);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
