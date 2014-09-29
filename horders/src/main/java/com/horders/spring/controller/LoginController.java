package com.horders.spring.controller;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.horders.dao.TopUpRecordDAO;
import com.horders.dao.WebsiteDAO;
import com.horders.model.My;
import com.horders.model.PhoneNumberRecord;
import com.horders.model.PhoneNumberWarehouse;
import com.horders.model.TopUpRecord;
import com.horders.model.UserInfo;
import com.horders.model.VerificationCode;
import com.horders.model.Website;
import com.horders.service.AccountInfoService;
import com.horders.service.GetCodeService;
import com.horders.service.PhoneNumberRecordService;
import com.horders.service.PhoneNumberWarehouseService;
import com.horders.service.TopUpRecordService;
import com.horders.service.VerificationCodeService;
import com.horders.service.WebsiteService;
import com.horders.spring.bean.GetCodeForm;
import com.horders.spring.bean.LoginForm;
import com.horders.spring.controller.AccountInfo.TopUpInfo;
import com.horders.utility.DrawImageCode;
import com.horders.utility.Email;
import com.horders.utility.SpringUtil;
import com.javacodegeeks.snippets.enterprise.dao.MyDAO;
import com.javacodegeeks.snippets.enterprise.model.Employee;
import com.javacodegeeks.snippets.enterprise.service.EmployeeService;
import com.javacodegeeks.snippets.enterprise.service.UserInfoService;
import com.horders.model.AccountInfo;


@Controller
public class LoginController {
	private static final String phoneNumberWarehouse = null;

	@RequestMapping(value="")
	public ModelAndView test2(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
		StringBuffer url = request.getRequestURL();
		System.out.println(url);
		String username = command.getUsername();
		//ModelAndView mv = new ModelAndView("/login/login","command","LOGIN SUCCESS, " + username);
		//ModelAndView mav = new ModelAndView("/login/login");
		ModelAndView mav = new ModelAndView("/home/index");
		mav.addObject("message","hello kitty");  
//		        Employee em = new Employee();
//				em.setId("0123456789");
//				em.setName("Johnneyiiil");
//				em.setAge(35);
//				EmployeeService emService = (EmployeeService) SpringUtil.getObject("employeeService");//context.getBean("employeeService");
//				emService.persistEmployee(em);
//		//List  
//        UserInfo em1 = new UserInfo();
//		em1.setId("2123456789");
//		em1.setName("Johnneyiiil");
//		em1.setAge(35);
//		UserInfoService emService1 = (UserInfoService) SpringUtil.getObject("userInfoService");//context.getBean("employeeService");
//		emService1.persistEmployee(em1);
//		My my = new My();
//		my.setId("212345678109");
//		my.setName("Johnneyiiidl");
//		MyDAO mydao = (MyDAO) SpringUtil.getObject("myDAO");
//		mydao.persistMy(my);
		
//		AccountInfo accountInfo = new AccountInfo();
//		//accountInfo.setAccountId(123456);
//		accountInfo.setFirstName("zirong");
//		accountInfo.setLastName("luo");
//		accountInfo.setCountry("china");
//		accountInfo.setRegistrationIp("192.168.0.1");
//		accountInfo.setEmail("zirongluo@163.com");
//		accountInfo.setEmailVerification(0);
//		accountInfo.setPhone("18767130034");
//		accountInfo.setPassword("123456");
//		accountInfo.setBalance(0);
//		accountInfo.setCreateTime(10);
//		accountInfo.setBalanceChangeTime(0);
//		AccountInfoService mydao = (AccountInfoService) SpringUtil.getObject("accountInfoService");
//		mydao.persistAccountInfo(accountInfo);
//		Email email = new Email("zirongluo@163.com", "nihao", "test");
//		EmailSendUtility.send(email);
		///////////////
//		TopUpRecord topupRecord = new TopUpRecord();
//		topupRecord.setAccountId(1);
//		topupRecord.setTopUpMoney(10);
//		topupRecord.setTopUpTradeNo("12345");
//		topupRecord.setOccurTime(System.currentTimeMillis());
//		topupRecord.setAccountBalance(10);
//		topupRecord.setAvailableBalance(10);
//		topupRecord.setTopUpType("payply");
//		topupRecord.setTopUpNumberOfTimes(12345);
//		topupRecord.setIsVerified(0);
//		TopUpRecordService mydao = (TopUpRecordService) SpringUtil.getObject("topUpRecordService");
//		mydao.persistTopUpRecord(topupRecord);
		
//		PhoneNumberWarehouse phoneNumberWarehouse = new PhoneNumberWarehouse();
//		phoneNumberWarehouse.setPhoneNumber("18767130034");
//		phoneNumberWarehouse.setPhoneSource("china");
//		phoneNumberWarehouse.setCountry("china");
//		phoneNumberWarehouse.setCountryCode("abc");
//		phoneNumberWarehouse.setIsValid(0);
//		phoneNumberWarehouse.setCreateTime(System.currentTimeMillis());
//		phoneNumberWarehouse.setIsOccupied(0);
//		PhoneNumberWarehouseService mydao = (PhoneNumberWarehouseService) SpringUtil.getObject("phoneNumberWarehouseService");
//		mydao.persistPhoneNumber(phoneNumberWarehouse);
		
//		PhoneNumberRecord phoneNumberRecord = new PhoneNumberRecord();
//		phoneNumberRecord.setPhoneNumber("18767130034");
//		phoneNumberRecord.setCountry("china");
//		phoneNumberRecord.setSite("facebook");
//		phoneNumberRecord.setOccurTime(System.currentTimeMillis());
//		PhoneNumberRecordService  mydao = (PhoneNumberRecordService) SpringUtil.getObject("phoneNumberRecordService");
//		mydao.persistPhoneNumberRecord(phoneNumberRecord);
		
//		VerificationCode verificationCode = new VerificationCode();
//		verificationCode.setAccountId(123456);
//		verificationCode.setOccurTime(System.currentTimeMillis());
//		verificationCode.setSite("fackbook");
//		verificationCode.setFromPhone("18767130034");
//		verificationCode.setToPhone("18767130034");
//		verificationCode.setText("dsfffffffffffffffffffffffffdgffsdd");
//		verificationCode.setIsSameText(0);
//		VerificationCodeService  mydao = (VerificationCodeService) SpringUtil.getObject("verificationCodeService");
//		mydao.persistVerificationCode(verificationCode);
		
		
		Email mail = (Email)SpringUtil.getObject("simpleMail");
        try {
			mail.sendMail("Spring SMTP Mail With Attachment Subject", "Spring SMTP Mail With Attachment Text Content", "zirongluo@163.com");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
//		GetCodeService mydao1 = (GetCodeService) SpringUtil.getObject("getCodeService");
//		//mydao.updateAccountById("123456");
//		//List list = mydao.queryAccountById("123456");
//		List list = mydao1.getAvailablePhoneNumber("facebook1");
//		if(list.size() != 0 ){
//			//response.set
//			PhoneNumberWarehouse accountInfo1 = (PhoneNumberWarehouse) list.get(0);
//			System.out.println(accountInfo1.getPhoneNumber()+ " ");
//		}
//        VerificationCodeService  mydao = (VerificationCodeService) SpringUtil.getObject("verificationCodeService");
//        //mydao.updateVerificationCodeById(1, "nihao");
//        //mydao.updateVerificationCodeByPhoneNumberAndSite("18767130034", "fackbook", "text");
//        List list = mydao.getPhoneNumberLastRecord("18767130034");
//		if(list.size() != 0 ){
//			//response.set
//			VerificationCode verificationCode = (VerificationCode) list.get(0);
//			System.out.println(verificationCode.getToPhone()+ " ");
//		}
		
//		Website obj = new Website();
//		obj.setSite("facebook");
//		obj.setCreateTime(57102);
		WebsiteService websiteDao  = (WebsiteService)SpringUtil.getObject("websiteService");;
		List list= websiteDao.getWebsiteInfo();
//		websiteDao.persistWebsite(obj);
		if(list.size() != 0 ){
			//response.set
			Website obj = (Website) list.get(0);
			System.out.println(obj.getSite()+ " ");
		}
		
		List<String> list1 = new ArrayList<String>();  
		list1.add("java");  
		list1.add("c++");  
		list1.add("oracle");  
		mav.addObject("bookList", list1);  

		//Map  
		Map<String,String> map = new HashMap<String,String>();  
		map.put("zhangsan", "北京");  
		map.put("lisi", "上海");  
		map.put("wangwu", "深圳");  
		mav.addObject("map",map); 
		return mav;
	}
	@RequestMapping(value="login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
		String username = command.getUsername();
		ModelAndView mav = new ModelAndView("/index/index");
		mav.addObject("message","hello kitty");  

		//List  
		List<String> list = new ArrayList<String>();  
		list.add("java");  
		list.add("c++");  
		list.add("oracle");  
		mav.addObject("bookList", list);  

		//Map  
		Map<String,String> map = new HashMap<String,String>();  
		map.put("zhangsan", "北京");  
		map.put("lisi", "上海");  
		map.put("wangwu", "深圳");  
		mav.addObject("map",map); 
		return mav;
	}
	@RequestMapping(value="test")
	public ModelAndView test(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
		String username = command.getUsername();
		ModelAndView mv = new ModelAndView("/index/index","command","LOGIN SUCCESS, ");
		return mv;
	}
	@RequestMapping(value="home/home")
	public ModelAndView home(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
		String username = command.getUsername();
		ModelAndView mv = new ModelAndView("/home/home","command","LOGIN SUCCESS, ");
		return mv;
	}

	@RequestMapping(value="topup/topup")
	public ModelAndView topup(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
		String username = command.getUsername();
		ModelAndView mv = new ModelAndView("/topup/topup","command","LOGIN SUCCESS, ");
		return mv;
	}

	@RequestMapping(value="home/image_code")
	public void getImageCode(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
		String username = command.getUsername();
		response.setHeader("Pragma", "No-cache");  
		response.setHeader("Cache-Control", "No-cache");  
		response.setDateHeader("Expires", 0);  
		//指定生成的响应图片  
		response.setContentType("image/jpeg");
		DrawImageCode drawImageCode = new DrawImageCode(80,30,BufferedImage.TYPE_INT_RGB);
		String code = drawImageCode.getImageCode();
		HttpSession session = request.getSession(true);  
		session.setMaxInactiveInterval(5*60);//设置session对象5分钟失效  
		session.setAttribute("code", code);
		//System.out.println(code);  
		try {
			ImageIO.write(drawImageCode, "JPEG", response.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		//        ModelAndView mv = new ModelAndView("/topup/topup","command","LOGIN SUCCESS, ");
		//        return mv;
	}
}