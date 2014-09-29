package com.horders.dao.impl;

import java.util.List;

import javax.swing.JSpinner.ListEditor;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.horders.dao.WebsiteDAO;
import com.horders.model.PhoneNumberRecord;
import com.horders.model.Website;

@Repository("websiteDAO")
public class WebsiteDAOImpl implements WebsiteDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	
	public void persistWebsite(Website website) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(website);
	}
	
	public List getWebsiteInfo(){
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Website website";
		Query query = session.createQuery(hql);
		List list = query.list();
		return list;
		
	}
	
	public List getWebSiteInfo(String website){
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Website website where website.site=:site";
		Query query = session.createQuery(hql);
		query.setString("site", website);
		List list = query.list();
		return list;
	}
}
