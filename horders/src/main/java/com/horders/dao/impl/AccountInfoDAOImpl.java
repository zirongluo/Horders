package com.horders.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.horders.dao.AccountInfoDAO;
import com.horders.model.AccountInfo;
import com.javacodegeeks.snippets.enterprise.model.Employee;

@Repository("accountInfoDAO")
public class AccountInfoDAOImpl implements AccountInfoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void persistAccountInfo(AccountInfo accountInfo) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(accountInfo);
	}

	public AccountInfo findAccountInfoById(String id) {
		// TODO Auto-generated method stub
		return (AccountInfo) sessionFactory.getCurrentSession().get(AccountInfo.class, id);
	}

	public void updateAccountInfo(AccountInfo accountInfo) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(accountInfo);

	}

	public void deleteAccountInfo(AccountInfo accountInfo) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(accountInfo);
	}

	public List queryAccountById(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List list=session.createQuery("select  new AccountInfo(accountInfo.accountId , accountInfo.firstName) from AccountInfo accountInfo").list();
		return list;
	}

	public int updateAccountById(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql="update AccountInfo accountInfo set accountInfo.firstName = 'fanyarong' where accountInfo.accountId='123456'";
		Query queryupdate=session.createQuery(hql);
		int ret=queryupdate.executeUpdate();
		return ret;
	}

	public List queryAccountByUsername(String username) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
//		String sql = "select  new AccountInfo(accountInfo.accountId , accountInfo.firstName) from AccountInfo accountInfo"
//				+ " where accountInfo.email = :email";
		String sql = " from AccountInfo accountInfo"
				+ " where accountInfo.email = :email";
		Query query = session.createQuery(sql);
		//List list=session.createQuery("select  new AccountInfo(accountInfo.accountId , accountInfo.firstName) from AccountInfo accountInfo").list();
		query.setString("email", username);
		List list = query.list();
		return list;
	}

}
