package com.horders.service;

import java.util.List;

import com.horders.dao.impl.WebsiteDAOImpl;
import com.horders.model.Website;

public interface WebsiteService {
	public void persistWebsite(Website website);
	public List getWebsiteInfo();
	public List getWebSiteInfo(String website);
}
