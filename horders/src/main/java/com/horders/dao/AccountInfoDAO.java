package com.horders.dao;

import java.util.List;

import com.horders.model.AccountInfo;
import com.javacodegeeks.snippets.enterprise.model.Employee;

public interface AccountInfoDAO {

	  void persistAccountInfo(AccountInfo accountInfo);
	  
	  AccountInfo findAccountInfoById(String id);
	  
	  void updateAccountInfo(AccountInfo accountInfo);
	  
	  void deleteAccountInfo(AccountInfo accountInfo);
	  
	  public List queryAccountById(String id);
	  
	  public int updateAccountById(String id);
	  
	  public List queryAccountByUsername(String username);
	  
}
