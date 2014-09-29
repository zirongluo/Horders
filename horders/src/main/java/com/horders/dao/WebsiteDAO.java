package com.horders.dao;

import java.util.List;

import com.horders.model.Website;


public interface WebsiteDAO {
	public void persistWebsite(Website website);
	public List getWebsiteInfo();
	public List getWebSiteInfo(String website);
}
