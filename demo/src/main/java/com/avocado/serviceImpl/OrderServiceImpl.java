package com.avocado.serviceImpl;

import com.avocado.dao.OrderMapper;
import com.avocado.entity.Order;
import com.avocado.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: ash
 * @create: 2020/06/13 13:48
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> allOrderList() {
        return orderMapper.allOrderList();
    }

    @Override
    public List<Order> userOrderList(int cId) {
        return orderMapper.userOrderList(cId);
    }

    @Override
    public int addOrder(Order order) {
        return orderMapper.insert(order);
    }

    @Override
    public int updateOrder(Order order) {
        return orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public int deleteOrder(Order order) {
        return orderMapper.deleteByPrimaryKey(order);
    }

    @Override
    public int deleteAllOrder(int cId) {
        return orderMapper.deleteAllOrder(cId);
    }
}
