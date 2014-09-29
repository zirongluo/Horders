package com.horders.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.horders.model.AccountInfo;
import com.horders.service.AccountInfoService;
import com.horders.spring.bean.LoginForm;
import com.horders.utility.SpringUtil;
import com.horders.utility.Utility;

@Controller
public class SignIn {
	private static String mCookieTag = "ZYKIDFTKDIOSDE_";
	@RequestMapping(value="signin")
    public void test(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
		String username = command.getUsername();
		String password = command.getPassword();
		boolean success = false ; 
		AccountInfoService accountInfoDAO = (AccountInfoService) SpringUtil.getObject("accountInfoService");
		List list = accountInfoDAO .queryAccountByUsername(username);
		if(list.size() > 0){
			AccountInfo accountInfo = (AccountInfo) list.get(0);
			String passwordMD5 = accountInfo.getPassword();
			String inputPasswordMD5 = Utility.MD5(password);
			
			if( passwordMD5.equals(inputPasswordMD5) ){
				success = true;
			}
			System.out.println(username+"  "+ password + " "+ accountInfo.getPassword() + " "+Utility.MD5(password));
			
		}
		if(!success){
			try {
				response.getWriter().write("fail");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		String cookieString = username +" "+ Utility.MD5(password);
		Cookie cookie = new Cookie(mCookieTag,cookieString);
		cookie.setMaxAge(3600);
		cookie.setPath("/");
		response.addCookie(cookie);
//		//String username = command.getUsername();
//		String temp =request.getParameter("username");
//		System.out.println("?? : " +cookie.getValue()+" "+username +" "+temp);
//        ModelAndView mv = new ModelAndView("/index/index","command","LOGIN SUCCESS, ");
//        return mv;
    }
}
