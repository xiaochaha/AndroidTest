package com.avocado.controller;

import com.avocado.entity.Order;
import com.avocado.serviceImpl.OrderServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: ash
 * @create: 2020/06/13 13:23
 */
@RestController
@Api(tags = {"订单管理"})
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @ApiOperation(value = "显示所有订单",notes = "显示所有订单")
    @RequestMapping(value = "/allOrderList",method = RequestMethod.GET)
    public List<Order> allFoodList() {
        return orderService.allOrderList();
    }

    @ApiOperation(value = "根据用户显示订单",notes = "根据用户显示订单")
    @RequestMapping(value = "/userOrderList",method = RequestMethod.GET)
    public List<Order> userOrderList(@RequestParam int cId) {
        return orderService.userOrderList(cId);
    }

    @ApiOperation(value = "用户添加订单",notes = "用户添加订单")
    @RequestMapping(value = "/addOrder",method = RequestMethod.POST)
    public int addOrder(@ApiParam Order order) {
        return orderService.addOrder(order);
    }

    @ApiOperation(value = "用户修改订单一个菜品",notes = "用户修改订单一个菜品")
    @RequestMapping(value = "/updateOrder",method = RequestMethod.POST)
    public int updateOrder(@ApiParam Order order) {
        return orderService.updateOrder(order);
    }

    @ApiOperation(value = "用户删除订单一个菜品",notes = "用户删除订单一个菜品")
    @RequestMapping(value = "/deleteOrder",method = RequestMethod.DELETE)
    public int deleteOrder(@ApiParam Order order) {
        return orderService.deleteOrder(order);
    }

    @ApiOperation(value = "用户删除所有订单",notes = "用户删除所有订单")
    @RequestMapping(value = "/deleteAllOrder",method = RequestMethod.DELETE)
    public int deleteAllOrder(@RequestParam int cId) {
        return orderService.deleteAllOrder(cId);
    }



}
