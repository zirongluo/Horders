package com.horders.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.horders.model.Website;
import com.horders.service.WebsiteService;
import com.horders.spring.bean.NewWebsiteForm;
import com.horders.utility.SpringUtil;

@Controller
public class WebsiteManager {
	//url : http://localhost:8080/horders/newWebsite?website=sina
	@RequestMapping(value="newWebsite")
	public void addNewWebsite(HttpServletRequest request,HttpServletResponse response,NewWebsiteForm newWebsiteForm){
		String websiteName = newWebsiteForm.getWebsite();
		Website website = new Website();
		website.setSite(websiteName);
		website.setCreateTime(System.currentTimeMillis());
		WebsiteService websiteService  = (WebsiteService)SpringUtil.getObject("websiteService");
		websiteService.persistWebsite(website);
		
	}
}
