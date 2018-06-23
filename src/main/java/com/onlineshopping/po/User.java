package com.onlineshopping.po;

import java.util.Date;

public class User {
	public int uID;
	public String uName;
	public String uPwd;
	public String uPhone;
	public String uCredit;
	public Date uRegTiem;
	public String uEmail;
	public int uPpwd;
	@Override
	public String toString() {
		return "Users [uID=" + uID + ", uName=" + uName + ", uPwd=" + uPwd + ", uPhone=" + uPhone
				+ ", uCredit=" + uCredit + ", uRegTiem=" + uRegTiem + ",uPpwd="+uPpwd+" uEmail=" + uEmail + "]";
	}
	public User() {
	}
	public User(int uID, String uName, String uPwd, String uPhone, String uCredit, Date uRegTiem, String uEmail,int uPpwd) {
		super();
		this.uID = uID;
		this.uName = uName;
		this.uPwd = uPwd;
		this.uPhone = uPhone;
		this.uCredit = uCredit;
		this.uRegTiem = uRegTiem;
		this.uEmail = uEmail;
		this.uPpwd=uPpwd;
	}

	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public String getuPhone() {
		return uPhone;
	}
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	public String getuCredit() {
		return uCredit;
	}
	public void setuCredit(String uCredit) {
		this.uCredit = uCredit;
	}
	public Date getuRegTiem() {
		return uRegTiem;
	}
	public void setuRegTiem(Date uRegTiem) {
		this.uRegTiem = uRegTiem;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	
}
