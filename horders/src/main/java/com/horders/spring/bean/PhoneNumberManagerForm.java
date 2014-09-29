package com.horders.spring.bean;

public class PhoneNumberManagerForm {
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneSource() {
		return PhoneSource;
	}
	public void setPhoneSource(String phoneSource) {
		PhoneSource = phoneSource;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String phoneNumber;
	private String PhoneSource;
	private String country;
	
}
