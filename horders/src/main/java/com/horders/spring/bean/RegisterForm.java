package com.horders.spring.bean;

public class RegisterForm {
	private String firstname;
	private String surname;
	private String email;
	private String password;
	private String confirm;
	private String nationlity;
	private String checknum;
	
	public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    } 
	public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
	public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }
	public String getConfirm() {
        return confirm;
    }	
    public void setNationlity(String nationlity) {
        this.nationlity = nationlity;
    }
	public String getNationlity() {
        return nationlity;
    }
    public void setChecknum(String checknum) {
        this.checknum = checknum;
    }
	public String getChecknum() {
        return checknum;
    }
}
