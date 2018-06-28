package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.po.OerderDetail1;

public interface OrderDetailMapper {
     public void insertOrderDetail(OerderDetail1 o);
     public List<OerderDetail1> selectOerderDetail(OerderDetail1 oerderDetail1);
     public List<OerderDetail1> selectOerderDetail1q();
}
