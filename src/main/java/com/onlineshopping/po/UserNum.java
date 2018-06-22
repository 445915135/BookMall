package com.onlineshopping.po;

import org.springframework.stereotype.Repository;

public class UserNum {
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "UserNum [num=" + num + "]";
	}
	
}
