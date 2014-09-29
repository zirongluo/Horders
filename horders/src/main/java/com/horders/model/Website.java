package com.horders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "website")
public class Website {
	@Id
	@Column(name = "site_id", nullable = false)
	private long siteId;
	
	public long getSiteId() {
		return siteId;
	}

	public void setSiteId(long siteId) {
		this.siteId = siteId;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
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

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
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

	@Column(name="site", nullable = false)
	private String site;
	
	@Column(name="create_time")
	private long createTime;
	
	@Column(name="valid_time")
	private long validTime;
	
	@Column(name = "cost", nullable = true)
	String cost;
	
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
