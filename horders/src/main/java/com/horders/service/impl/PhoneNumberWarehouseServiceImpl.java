package com.horders.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.horders.dao.PhoneNumberWarehouseDAO;
import com.horders.model.PhoneNumberWarehouse;
import com.horders.service.PhoneNumberWarehouseService;

@Service("phoneNumberWarehouseService")
public class PhoneNumberWarehouseServiceImpl implements
PhoneNumberWarehouseService {
	@Autowired
	PhoneNumberWarehouseDAO phoneNumberWarehouseDAO;

	@Transactional
	public void persistPhoneNumber(PhoneNumberWarehouse phoneNumberWarehouse) {
		// TODO Auto-generated method stub
		phoneNumberWarehouseDAO.persistPhoneNumber(phoneNumberWarehouse);
	}

}
