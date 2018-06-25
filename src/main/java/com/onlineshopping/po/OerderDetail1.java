package com.onlineshopping.po;

import java.util.Date;

public class OerderDetail1 {
	int odID;
    int odNum;
    String odEvalution;
    String odTime;
    Orders orders;
    Goods goods;
	public int getOdID() {
		return odID;
	}
	public void setOdID(int odID) {
		this.odID = odID;
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
	public String getOdTime() {
		return odTime;
	}
	public void setOdTime(String odTime) {
		this.odTime = odTime;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	@Override
	public String toString() {
		return "OrderDetail [odID=" + odID + ", odNum=" + odNum
				+ ", odEvalution=" + odEvalution + ", odTime=" + odTime
				+ ", orders=" + orders + ", goods=" + goods + "]";
	}
    
	
}
