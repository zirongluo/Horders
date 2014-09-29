package com.horders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_info")
public class AccountInfo {
	
	public AccountInfo(){
		
	}
	public AccountInfo(long accountId , String firstName){
		this.accountId = accountId;
		this.firstName = firstName;
		
	}

	@Id
	@Column(name = "account_id", nullable = false)
	private long accountId;
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegistrationIp() {
		return registrationIp;
	}
	public void setRegistrationIp(String registrationIp) {
		this.registrationIp = registrationIp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getEmailVerification() {
		return emailVerification;
	}
	public void setEmailVerification(long emailVerification) {
		this.emailVerification = emailVerification;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public long getValidTime() {
		return validTime;
	}
	public void setValidTime(long validTime) {
		this.validTime = validTime;
	}
	public long getBalanceChangeTime() {
		return balanceChangeTime;
	}
	public void setBalanceChangeTime(long balanceChangeTime) {
		this.balanceChangeTime = balanceChangeTime;
	}
	public int getMemberPoints() {
		return memberPoints;
	}
	public void setMemberPoints(int memberPoints) {
		this.memberPoints = memberPoints;
	}
	public int getIsFrozon() {
		return isFrozon;
	}
	public void setIsFrozon(int isFrozon) {
		this.isFrozon = isFrozon;
	}
	public int getMemberRank() {
		return memberRank;
	}
	public void setMemberRank(int memberRank) {
		this.memberRank = memberRank;
	}
	public String getCol1() {
		return col1;
	}
	public void setCol1(String col1) {
		this.col1 = col1;
	}
	public String getCol2() {
		return col2;
	}
	public void setCol2(String col2) {
		this.col2 = col2;
	}
	public String getCol3() {
		return col3;
	}
	public void setCol3(String col3) {
		this.col3 = col3;
	}
	public String getCol4() {
		return col4;
	}
	public void setCol4(String col4) {
		this.col4 = col4;
	}
	public String getCol5() {
		return col5;
	}
	public void setCol5(String col5) {
		this.col5 = col5;
	}
	public String getCol6() {
		return col6;
	}
	public void setCol6(String col6) {
		this.col6 = col6;
	}
	public String getCol7() {
		return col7;
	}
	public void setCol7(String col7) {
		this.col7 = col7;
	}
	public String getCol8() {
		return col8;
	}
	public void setCol8(String col8) {
		this.col8 = col8;
	}
	public String getCol9() {
		return col9;
	}
	public void setCol9(String col9) {
		this.col9 = col9;
	}
	public String getCol10() {
		return col10;
	}
	public void setCol10(String col10) {
		this.col10 = col10;
	}

	@Column(name = "first_name", nullable = false)
	String firstName;
	
	@Column(name = "last_name", nullable = false)
	String lastName;
	
	@Column(name = "country", nullable = false)
	String country;
	
	@Column(name = "registration_ip", nullable = true)
	String registrationIp;
	
	@Column(name = "email", nullable = false)
	String email;
	
	@Column(name = "email_verification", nullable = false)
	private long emailVerification;
	
	@Column(name = "phone", nullable = true)
	String phone;
	
	@Column(name = "password", nullable = false)
	String password;
	
	@Column(name = "balance", nullable = false)
	private int balance;
	
	@Column(name = "create_time", nullable = false)
	private long  createTime;
	
	@Column(name = "valid_time", nullable = true)
	private long  validTime;
	
	@Column(name = "balance_change_time", nullable = false)
	private long  balanceChangeTime;
	
	@Column(name = "member_points", nullable = true)
	private int  memberPoints;
	
	@Column(name = "is_frozon", nullable = true)
	private int  isFrozon;
	
	@Column(name = "member_rank", nullable = true)
	private int  memberRank;
	
	@Column(name = "col1", nullable = true)
	String col1;
	
	@Column(name = "col2", nullable = true)
	String col2;
	
	@Column(name = "col3", nullable = true)
	String col3;
	
	@Column(name = "col4", nullable = true)
	String col4;
	
	@Column(name = "col5", nullable = true)
	String col5;
	
	@Column(name = "col6", nullable = true)
	String col6;
	
	@Column(name = "col7", nullable = true)
	String col7;
	
	@Column(name = "col8", nullable = true)
	String col8;
	
	@Column(name = "col9", nullable = true)
	String col9;
	
	@Column(name = "col10", nullable = true)
	String col10;
	
}
