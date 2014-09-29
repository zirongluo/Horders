package com.horders.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.horders.dao.GetCodeDAO;

@Repository("getCodeDAO")
public class GetCodeDAOImpl implements GetCodeDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public List getAvailablePhoneNumber(String project) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
//		String sql = "select new PhoneNumberWarehouse(phoneNumberWarehouse.phoneNumber) "
//				+ "from PhoneNumberWarehouse phoneNumberWarehouse PhoneNumberRecord "
//				+ "phoneNumberRecord where not exists ( from phoneNumberRecord where "
//				+ "phoneNumberWarehouse.phoneNumber = phoneNumberRecord.phoneNumber and"
//				+ "phoneNumberRecord.site = : project";
		
//		String sql = "from PhoneNumberWarehouse phoneNumberWarehouse "
//				+ "WHERE EXISTS( FROM PhoneNumberRecord phoneNumberRecord WHERE"
//				+ " phoneNumberWarehouse.phoneNumber = phoneNumberRecord.phoneNumber"
//				+"AND phoneNumberRecord.site = 'facebook')";
		
		String sql = "select new PhoneNumberWarehouse(phoneNumberWarehouse.phoneNumber) from PhoneNumberWarehouse phoneNumberWarehouse,VerificationCode verificationCode"
				+" WHERE NOT EXISTS( FROM verificationCode WHERE"
				+" phoneNumberWarehouse.phoneNumber = verificationCode.toPhone and "
				+" verificationCode.site = :project)";
		
		Query query = session.createQuery(sql);
		//List list=session.createQuery("select  new AccountInfo(accountInfo.accountId , accountInfo.firstName) from AccountInfo accountInfo").list();
		query.setString("project", project);
		List list = query.list();
		return list;
	}

}
