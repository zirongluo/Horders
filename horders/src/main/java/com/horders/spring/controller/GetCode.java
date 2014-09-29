package com.horders.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.horders.model.Website;
import com.horders.service.WebsiteService;
import com.horders.spring.bean.LoginForm;
import com.horders.spring.bean.NewWebsiteForm;
import com.horders.utility.SpringUtil;

@Controller
public class GetCode {
	@RequestMapping(value="code/get_code")
	public ModelAndView getCode(HttpServletRequest request,HttpServletResponse response,NewWebsiteForm newWebsiteForm ){
		//String username = command.getUsername();
		
//		WebsiteService websiteDao  = (WebsiteService)SpringUtil.getObject("websiteService");;
//		List list= websiteDao.getWebsiteInfo();
//		List<Website> websites = new ArrayList<Website>();
//		for(int i = 0 ; i < list.size(); i++ ){
//			//response.set
//			Website obj = (Website) list.get(i);
//			Website website = new Website();
//			website.setSite(obj.getSite());
//			websites.add(website);
//			System.out.println(obj.getSite()+ " ");
//		}

		ModelAndView mv = new ModelAndView("/code/get_code","command","LOGIN SUCCESS, ");
//		mv.addObject("websiteInfos",websites);
		return mv;
	}
	
	@RequestMapping(value="code/get_code_content")
	public ModelAndView getCodeContent(HttpServletRequest request,HttpServletResponse response,NewWebsiteForm newWebsiteForm ){	
		//load all websit from Website
		WebsiteService websiteService  = (WebsiteService)SpringUtil.getObject("websiteService");;
		List list= websiteService.getWebsiteInfo();
		List<Website> websites = new ArrayList<Website>();
		for(int i = 0 ; i < list.size(); i++ ){
			Website obj = (Website) list.get(i);
			Website website = new Website();
			website.setSite(obj.getSite());
			websites.add(website);
			//System.out.println(obj.getSite()+ " ");
		}
		ModelAndView mv = new ModelAndView("/code/get_code_content","command","LOGIN SUCCESS, ");
		mv.addObject("websiteInfos",websites);
		return mv;
	}
		
}
