package com.avocado.service;

import com.avocado.entity.Order;

import java.util.List;

public interface OrderService {

    //显示所有订单
    public List<Order> allOrderList();
    //根据用户显示订单
    public List<Order> userOrderList(int cId);
    //用户添加订单
    public int addOrder(Order order);
    //用户修改订单一个菜品
    public int updateOrder(Order order);
    //用户删除订单一个菜品
    public int deleteOrder(Order order);
    //用户删除所有订单
    public int deleteAllOrder(int cId);


}
