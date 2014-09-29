package com.horders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "top_up_record")
public class TopUpRecord {

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public int getTopUpMoney() {
		return topUpMoney;
	}

	public void setTopUpMoney(int topUpMoney) {
		this.topUpMoney = topUpMoney;
	}

	public String getTopUpTradeNo() {
		return topUpTradeNo;
	}

	public void setTopUpTradeNo(String topUpTradeNo) {
		this.topUpTradeNo = topUpTradeNo;
	}

	public long getOccurTime() {
		return occurTime;
	}

	public void setOccurTime(long occurTime) {
		this.occurTime = occurTime;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(int availableBalance) {
		this.availableBalance = availableBalance;
	}

	public long getValidationTime() {
		return validationTime;
	}

	public void setValidationTime(long validationTime) {
		this.validationTime = validationTime;
	}

	public String getTopUpType() {
		return topUpType;
	}

	public void setTopUpType(String topUpType) {
		this.topUpType = topUpType;
	}

	public long getTopUpNumberOfTimes() {
		return topUpNumberOfTimes;
	}

	public void setTopUpNumberOfTimes(long topUpNumberOfTimes) {
		this.topUpNumberOfTimes = topUpNumberOfTimes;
	}

	public int getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(int isVerified) {
		this.isVerified = isVerified;
	}

	public String getTopUpAddress() {
		return topUpAddress;
	}

	public void setTopUpAddress(String topUpAddress) {
		this.topUpAddress = topUpAddress;
	}

	public String getTopUpEmail() {
		return topUpEmail;
	}

	public void setTopUpEmail(String topUpEmail) {
		this.topUpEmail = topUpEmail;
	}

	public int getIsUs() {
		return isUs;
	}

	public void setIsUs(int isUs) {
		this.isUs = isUs;
	}

	public String getCol1() {
		return col1;
	}

	public void setCol1(String col1) {
		this.col1 = col1;
	}

	public String getCol12() {
		return col12;
	}

	public void setCol12(String col12) {
		this.col12 = col12;
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

	public String getCol15() {
		return col15;
	}

	public void setCol15(String col15) {
		this.col15 = col15;
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

	public String getCol19() {
		return col19;
	}

	public void setCol19(String col19) {
		this.col19 = col19;
	}

	public String getCol10() {
		return col10;
	}

	public void setCol10(String col10) {
		this.col10 = col10;
	}

	@Id
	@Column(name = "account_id", nullable = false)
	private long accountId;
	
	@Column(name = "top_up_money", nullable = false)
	private int topUpMoney;
	
	@Column(name = "top_up_trade_no", nullable = false)
	private String topUpTradeNo;
	
	@Column(name = "occur_time", nullable = false)
	private long occurTime;
	
	@Column(name = "account_balance", nullable = false)
	private int accountBalance;
	
	@Column(name = "available_balance", nullable = false)
	private int availableBalance;
	
	@Column(name = "validation_time", nullable = true)
	private long validationTime;
	
	@Column(name = "top_up_type", nullable = false)
	private String topUpType;
	
	@Column(name = "top_up_number_of_times", nullable = false)
	private long topUpNumberOfTimes;
	
	@Column(name = "is_verified", nullable = false)
	private int isVerified;
	
	@Column(name = "top_up_address", nullable = true)
	private String topUpAddress;
	
	@Column(name = "top_up_email", nullable = true)
	private String topUpEmail;
	
	@Column(name = "is_us", nullable = true)
	private int isUs;
	
	@Column(name = "col1", nullable = true)
	private String col1;
	
	@Column(name = "col2", nullable = true)
	private String col12;
	
	@Column(name = "col3", nullable = true)
	private String col3;
	
	@Column(name = "col4", nullable = true)
	private String col4;
	
	@Column(name = "col5", nullable = true)
	private String col15;
	
	@Column(name = "col6", nullable = true)
	private String col6;
	
	@Column(name = "col7", nullable = true)
	private String col7;
	
	@Column(name = "col8", nullable = true)
	private String col8;
	
	@Column(name = "col9", nullable = true)
	private String col19;
	
	@Column(name = "col10", nullable = true)
	private String col10;
}
