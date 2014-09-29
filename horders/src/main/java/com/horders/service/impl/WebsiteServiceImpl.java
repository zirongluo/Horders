package com.horders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.horders.dao.WebsiteDAO;
import com.horders.dao.impl.WebsiteDAOImpl;
import com.horders.model.Website;
import com.horders.service.WebsiteService;

@Service("websiteService")
public class WebsiteServiceImpl implements WebsiteService {

	@Autowired
	WebsiteDAO websiteDAO;
	
	@Transactional
	public void persistWebsite(Website website) {
		// TODO Auto-generated method stub
		websiteDAO.persistWebsite(website);;
	}

	@Transactional
	public List getWebsiteInfo() {
		// TODO Auto-generated method stub
		return websiteDAO.getWebsiteInfo();
	}

	@Transactional
	public List getWebSiteInfo(String website) {
		// TODO Auto-generated method stub
		return websiteDAO.getWebSiteInfo(website);
	}
}
