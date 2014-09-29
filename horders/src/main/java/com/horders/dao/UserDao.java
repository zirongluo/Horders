package com.horders.dao;

import com.horders.model.UserInfo;

public interface UserDao {
	UserInfo findByName(String name);  

	UserInfo findByLoginName(String loginName);  

	void saveOrUpdate(UserInfo user);
}
