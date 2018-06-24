package com.onlineshopping.po;

import java.util.Date;

public class OrderDetail {
	public int odID;
	public int oID;
	public int gdID;
	public int odNum;
	public String odEvalution;
	public Date odTime;
	@Override
	public String toString() {
		return "OrderDetail [odID=" + odID + ", oID=" + oID + ", gdID=" + gdID + ", odNum=" + odNum + ", odEvalution="
				+ odEvalution + ", odTime=" + odTime + "]";
	}
	public int getOdID() {
		return odID;
	}
	public void setOdID(int odID) {
		this.odID = odID;
	}
	public int getoID() {
		return oID;
	}
	public void setoID(int oID) {
		this.oID = oID;
	}
	public int getGdID() {
		return gdID;
	}
	public void setGdID(int gdID) {
		this.gdID = gdID;
	}
	public int getOdNum() {
		return odNum;
	}
	public void setOdNum(int odNum) {
		this.odNum = odNum;
	}
	public String getOdEvalution() {
		return odEvalution;
	}
	public void setOdEvalution(String odEvalution) {
		this.odEvalution = odEvalution;
	}
	public Date getOdTime() {
		return odTime;
	}
	public void setOdTime(Date odTime) {
		this.odTime = odTime;
	}
	
}
