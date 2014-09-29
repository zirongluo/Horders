package com.horders.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.horders.model.AccountInfo;
import com.horders.service.AccountInfoService;
import com.horders.spring.bean.LoginForm;
import com.horders.spring.bean.RegisterForm;
import com.horders.utility.Email;
import com.horders.utility.SpringUtil;
import com.horders.utility.Utility;

@Controller
public class Register {
	@RequestMapping(value="register")
    public void test(HttpServletRequest request,HttpServletResponse response,RegisterForm registerForm ){
		String username = registerForm.getFirstname();
		System.out.println(username);
		
		String firstName = registerForm.getFirstname();
		String surname = registerForm.getSurname();
		String country = registerForm.getNationlity();
		String registerIp = request.getRemoteAddr();
		String email = registerForm.getEmail();
		String password = Utility.MD5(registerForm.getPassword());
		//String confirmPassword = registerForm.getConfirm();
		long createTime = System.currentTimeMillis();
		
	
		AccountInfoService accountInfoDAO = (AccountInfoService) SpringUtil.getObject("accountInfoService");
		List list = accountInfoDAO .queryAccountByUsername(email);
		if(list.size() != 0 ){
			//response.set
			try {
				response.getWriter().write("fail");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ; 
		}
		
		Email mail = (Email)SpringUtil.getObject("simpleMail");
        try {
			mail.sendMail("Spring SMTP Mail With Attachment Subject", "Spring SMTP Mail With Attachment Text Content", email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				response.getWriter().write("fail");
				return;
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			e.printStackTrace();
		}
		AccountInfo accountInfo = new AccountInfo();
		//accountInfo.setAccountId(123456);
		accountInfo.setFirstName(firstName);
		accountInfo.setLastName(surname);
		accountInfo.setCountry(country);
		accountInfo.setRegistrationIp(registerIp);
		accountInfo.setEmail(email);
		accountInfo.setEmailVerification(0);
		accountInfo.setPhone("");
		accountInfo.setPassword(password);
		accountInfo.setBalance(0);
		accountInfo.setCreateTime(createTime);
		accountInfo.setBalanceChangeTime(createTime);
		accountInfoDAO .persistAccountInfo(accountInfo);
        //ModelAndView mv = new ModelAndView("/index/index","command","LOGIN SUCCESS, ");
        //return mv;
//		try {
//			response.sendRedirect("register_success");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }
	@RequestMapping(value="register_success")
    public ModelAndView registerSuccess(HttpServletRequest request,HttpServletResponse response,RegisterForm registerForm ){
		//String username = registerForm.getFirstname();
		//System.out.println(username);
        ModelAndView mv = new ModelAndView("/home/registerSuccess","command","LOGIN SUCCESS, ");
        return mv;
//		try {
//			response.sendRedirect("horders/index/index");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }
}
