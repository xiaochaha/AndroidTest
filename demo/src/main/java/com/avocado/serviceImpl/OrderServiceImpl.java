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
        return null;
    }

    @Override
    public Order addOrder(int cId, int fId) {
        return null;
    }

    @Override
    public Order updateOrder(int cId, int fId) {
        return null;
    }

    @Override
    public int deleteOrder(int cId, int fId) {
        return 0;
    }

    @Override
    public int deleteAllOrder(int cId) {
        return 0;
    }
}
