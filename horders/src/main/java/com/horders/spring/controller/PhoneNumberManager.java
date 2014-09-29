package com.horders.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.horders.model.PhoneNumberWarehouse;
import com.horders.model.VerificationCode;
import com.horders.service.PhoneNumberWarehouseService;
import com.horders.service.VerificationCodeService;
import com.horders.spring.bean.PhoneNumberManagerForm;
import com.horders.spring.bean.UpdateVerificationCodeForm;
import com.horders.utility.SpringUtil;

@Controller
public class PhoneNumberManager {
	
	//url : http://localhost:8080/horders/new_phone_number?phoneNumber=18767130035&phoneSource=google%20voice&country=US
	@RequestMapping(value="new_phone_number")
	public void getPhoneNumber(HttpServletRequest request,HttpServletResponse response,PhoneNumberManagerForm phoneNumberManagerForm){
		String phoneNumber = phoneNumberManagerForm.getPhoneNumber();
		String phoneSrouce = phoneNumberManagerForm.getPhoneSource();
		String country = phoneNumberManagerForm.getCountry();
		PhoneNumberWarehouse phoneNumberWarehouse = new PhoneNumberWarehouse();
		phoneNumberWarehouse.setPhoneNumber(phoneNumber);
		phoneNumberWarehouse.setPhoneSource(phoneSrouce);
		phoneNumberWarehouse.setCountry(country);
		phoneNumberWarehouse.setCountryCode("abc");
		phoneNumberWarehouse.setIsValid(0);
		phoneNumberWarehouse.setCreateTime(System.currentTimeMillis());
		phoneNumberWarehouse.setIsOccupied(0);
		PhoneNumberWarehouseService mydao = (PhoneNumberWarehouseService) SpringUtil.getObject("phoneNumberWarehouseService");
		mydao.persistPhoneNumber(phoneNumberWarehouse);
	}
}
