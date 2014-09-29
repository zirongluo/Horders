package com.horders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.horders.dao.AccountInfoDAO;
import com.horders.model.AccountInfo;
import com.horders.service.AccountInfoService;
import com.javacodegeeks.snippets.enterprise.dao.EmployeeDAO;

@Service("accountInfoService")
public class AccountInfoServiceImpl extends AccountInfo implements
		AccountInfoService {

	@Autowired
	AccountInfoDAO accountInfoDAO;
	
	@Transactional
	public void persistAccountInfo(AccountInfo accountInfo) {
		// TODO Auto-generated method stub
		accountInfoDAO.persistAccountInfo(accountInfo);
	}
	
	@Transactional
	public AccountInfo findAccountInfoById(String id) {
		// TODO Auto-generated method stub
		return accountInfoDAO.findAccountInfoById(id);
	}
	
	@Transactional
	public void updateAccountInfo(AccountInfo accountInfo) {
		// TODO Auto-generated method stub
		accountInfoDAO.updateAccountInfo(accountInfo);
	}

	@Transactional
	public void deleteAccountInfo(AccountInfo accountInfo) {
		// TODO Auto-generated method stub
		accountInfoDAO.deleteAccountInfo(accountInfo);
	}

	@Transactional
	public List queryAccountById(String id) {
		// TODO Auto-generated method stub
		return accountInfoDAO.queryAccountById(id);
	}
	
	@Transactional
	public int updateAccountById(String id){
		return accountInfoDAO.updateAccountById(id);
	}

	@Transactional
	public List queryAccountByUsername(String username) {
		// TODO Auto-generated method stub
		return accountInfoDAO.queryAccountByUsername(username);
	}
}
