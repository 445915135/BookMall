package com.onlineshopping.dao;

import com.onlineshopping.po.Orders;

public interface OrdersMappers {
      public void insertOrders(Orders orders);
      public Orders selectOrdersID(Orders orders);
}
