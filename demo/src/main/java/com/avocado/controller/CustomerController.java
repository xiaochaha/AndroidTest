package com.avocado.controller;

import com.avocado.entity.Customer;
import com.avocado.service.CustomerService;
import com.avocado.serviceImpl.CustomerServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: demo
 * @description:
 * @author: ash
 * @create: 2020/06/11 22:18
 */
@RestController
@Api(tags = {"顾客管理"})
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @ApiOperation(value = "顾客登录",notes = "根据顾客的账号密码来登入")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = false, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = false, dataType = "String")
    })
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Customer login(@ApiParam String username, @ApiParam String password) {
        return customerService.login(username,password);
    }

    @ApiOperation(value = "顾客注册",notes = "顾客注册")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public  int register(@ApiParam Customer customer) {
        return customerService.register(customer);
    }


}
