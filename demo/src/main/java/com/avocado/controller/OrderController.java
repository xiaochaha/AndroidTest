package com.avocado.controller;

import com.avocado.entity.Order;
import com.avocado.serviceImpl.OrderServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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



}
