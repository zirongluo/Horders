package com.horders.service;

import java.util.List;

import com.horders.model.AccountInfo;

public interface AccountInfoService {
	  void persistAccountInfo(AccountInfo accountInfo);
	  
	  AccountInfo findAccountInfoById(String id);
	  
	  void updateAccountInfo(AccountInfo accountInfo);
	  
	  void deleteAccountInfo(AccountInfo accountInfo);
	  
	  public List queryAccountById(String id);
	  
	  public int updateAccountById(String id);
	  
	  public List queryAccountByUsername(String username);
}
