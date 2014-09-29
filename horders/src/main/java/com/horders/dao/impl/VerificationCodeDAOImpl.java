package com.horders.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.horders.dao.VerificationCodeDAO;
import com.horders.model.VerificationCode;

@Repository("verificationCodeDAO")
public class VerificationCodeDAOImpl implements VerificationCodeDAO {
@Autowired
SessionFactory sessionFactory;
	public void persistVerificationCode(VerificationCode verificationCode) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(verificationCode);
	}
	public int updateVerificationCodeById(long id, String text) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql="update VerificationCode verificationCode set verificationCode.text = :text where verificationCode.uniqueId = :uniqueId";
		Query queryupdate=session.createQuery(hql);
		queryupdate.setLong("uniqueId", new Long(id));
		queryupdate.setString("text", text);
		int ret=queryupdate.executeUpdate();
		return ret;
	}
	
	public int updateVerificationCodeByPhoneNumberAndSite(String phoneNumber, String site, String text) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql="update VerificationCode verificationCode set verificationCode.text = :text where verificationCode.toPhone = :toPhone"
				+ " and verificationCode.site = :site";
//		String hql="update VerificationCode verificationCode set verificationCode.text = 'abc' where verificationCode.toPhone = '18767130034'"
//				+ " and verificationCode.site = 'facebook'";
		Query queryupdate=session.createQuery(hql);
		queryupdate.setString("text", text);
		queryupdate.setString("toPhone", phoneNumber);
		queryupdate.setString("site", site);
		int ret=queryupdate.executeUpdate();
		return ret;
	}
	
	public List getPhoneNumberLastRecord(String phoneNumber){
		Session session = sessionFactory.getCurrentSession();
		String hql = "from VerificationCode verificationCode where verificationCode.toPhone = :toPhone"
				+ " order by verificationCode.occurTime desc";
		Query query = session.createQuery(hql);
		//List list=session.createQuery("select  new AccountInfo(accountInfo.accountId , accountInfo.firstName) from AccountInfo accountInfo").list();
		query.setString("toPhone", phoneNumber);
		query.setMaxResults(1);
		List list = query.list();
		return list;
	}
	
	public List getVerificationCode(String phoneNum, String project){
		Session session = sessionFactory.getCurrentSession();
		String hql = "from VerificationCode verificationCode where verificationCode.toPhone = :toPhone"
				+ " and verificationCode.site = :site"; 
		Query query = session.createQuery(hql);
		query.setString("toPhone", phoneNum);
		query.setString("site", project);
		List list = query.list();
		return list;
	}
}
