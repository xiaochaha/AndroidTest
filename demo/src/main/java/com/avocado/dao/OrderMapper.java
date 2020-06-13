package com.avocado.dao;

import com.avocado.entity.Customer;
import com.avocado.entity.Order;
import com.avocado.entity.OrderExample;
import com.avocado.entity.OrderKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(OrderKey key);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(OrderKey key);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> allOrderList();

    List<Order> userOrderList(@Param("cId")int cId);

    //int addOrder(@Param("cId")int cId, @Param("fId")int fId);

    //int updateOrder(Order order);

    //int deleteOrder(Order order);

    int deleteAllOrder(@Param("cId")int cId);
}