package com.horders.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.horders.spring.bean.LoginForm;

@Controller
public class AccountInfo {
	@RequestMapping(value="accountinfo")
    public ModelAndView userInfo(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
//		Cookie cookie = new Cookie(mCookieTag,"cookievalue");
//		cookie.setMaxAge(3600);
//		cookie.setPath("/");
//		response.addCookie(cookie);
//		String username = command.getUsername();
//		String temp =request.getParameter("username");
//		System.out.println("?? : " +cookie.getValue()+" "+username +" "+temp);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
        ModelAndView mv = new ModelAndView("/accountinfo/accountinfo","command","LOGIN SUCCESS, ");
        return mv;
    }
	
	
	@RequestMapping(value="topupInfo")
    public ModelAndView topupInfo(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
//		Cookie cookie = new Cookie(mCookieTag,"cookievalue");
//		cookie.setMaxAge(3600);
//		cookie.setPath("/");
//		response.addCookie(cookie);
//		String username = command.getUsername();
//		String temp =request.getParameter("username");
//		System.out.println("?? : " +cookie.getValue()+" "+username +" "+temp);
        ModelAndView mv = new ModelAndView("/accountinfo/topupInfo");
		List<TopUpInfo> list = new ArrayList<TopUpInfo>();
        for(int i = 0 ; i <10 ; ++i){
		TopUpInfo topUpInfo = new TopUpInfo();
		topUpInfo.id = "1";
		topUpInfo.description = "Top-up $10 Through the paypal";
		topUpInfo.amount = "$10";
		topUpInfo.balance = "$10";
		topUpInfo.time = "9/6/2014 16:17:15   AM";
//		list.add("java");  
//		list.add("c++");  
//		list.add("oracle");
		list.add(topUpInfo);
        }
		mv.addObject("accountInfoList", list);  
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
        return mv;
    }
	@RequestMapping(value="verficationCodeInfo")
    public ModelAndView verficationCodeInfo(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
//		Cookie cookie = new Cookie(mCookieTag,"cookievalue");
//		cookie.setMaxAge(3600);
//		cookie.setPath("/");
//		response.addCookie(cookie);
//		String username = command.getUsername();
//		String temp =request.getParameter("username");
//		System.out.println("?? : " +cookie.getValue()+" "+username +" "+temp);
        ModelAndView mv = new ModelAndView("/accountinfo/verficationCodeInfo");
		List<TopUpInfo> list = new ArrayList<TopUpInfo>();
        for(int i = 0 ; i <10 ; ++i){
		TopUpInfo topUpInfo = new TopUpInfo();
		topUpInfo.id = "2";
		topUpInfo.description = "Top-up $10 Through the paypal";
		topUpInfo.amount = "$10";
		topUpInfo.balance = "$10";
		topUpInfo.time = "9/6/2014 16:17:15   AM";
//		list.add("java");  
//		list.add("c++");  
//		list.add("oracle");
		list.add(topUpInfo);
        }
		mv.addObject("accountInfoList", list);  
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
        return mv;
    }
	public class TopUpInfo{
		public String id;
		public String description;
		public String amount;
		public String balance;
		public String time;
		public TopUpInfo(){
			
		}
		public String getId()
		{
			return id;
		}
		public void setId(String id)
		{
			this.id = id;
		}	
		public String getDescription()
		{
			return description;
		}
		public void setDescription(String description)
		{
			this.description = description;
		}
	}
}
