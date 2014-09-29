package com.horders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "verification_code")
public class VerificationCode {

	public long getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(long uniqueId) {
		this.uniqueId = uniqueId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getOccurTime() {
		return occurTime;
	}

	public void setOccurTime(long occurTime) {
		this.occurTime = occurTime;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getFromPhone() {
		return fromPhone;
	}

	public void setFromPhone(String fromPhone) {
		this.fromPhone = fromPhone;
	}

	public String getToPhone() {
		return toPhone;
	}

	public void setToPhone(String toPhone) {
		this.toPhone = toPhone;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getIsSameText() {
		return isSameText;
	}

	public void setIsSameText(int isSameText) {
		this.isSameText = isSameText;
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
	@Column(name="unique_id" , nullable = false)
	private long uniqueId;
	
	@Column(name = "account_id" , nullable = false)
	private long accountId;
	
	@Column(name = "occur_time" , nullable = false)
	private long occurTime;
	
	@Column(name = "site" , nullable = false)
	private String site;
	
	@Column(name = "from_phone", nullable = false)
	private String fromPhone;
	
	@Column(name = "to_phone" , nullable = false)
	private String toPhone;
	
	@Column(name = "text" , nullable = false)
	private String text;
	
	@Column(name= "is_same_text" , nullable = false)
	private int isSameText;
	
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
