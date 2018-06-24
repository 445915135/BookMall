package com.onlineshopping.po;

public class Orders {
    int oID;
    String oTime;
    float oTotal;
    User uID;
    Goods goods;
	public int getoID() {
		return oID;
	}
	public void setoID(int oID) {
		this.oID = oID;
	}
	public String getoTime() {
		return oTime;
	}
	public void setoTime(String oTime) {
		this.oTime = oTime;
	}
	public float getoTotal() {
		return oTotal;
	}
	public void setoTotal(float oTotal) {
		this.oTotal = oTotal;
	}
	public User getuID() {
		return uID;
	}
	public void setuID(User uID) {
		this.uID = uID;
	}
	
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	@Override
	public String toString() {
		return "Orders [oID=" + oID + ", oTime=" + oTime + ", oTotal=" + oTotal
				+ ", uID=" + uID + ", goods=" + goods + "]";
	}

	
    
}
