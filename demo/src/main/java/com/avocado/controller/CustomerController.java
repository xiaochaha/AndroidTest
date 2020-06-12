package com.avocado.controller;

import com.avocado.entity.Customer;
import com.avocado.service.CustomerService;
import com.avocado.serviceImpl.CustomerServiceImpl;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: ash
 * @create: 2020/06/11 22:18
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @ApiOperation(value = "用户登录",notes = "根据用户的账号密码来登入")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = false, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = false, dataType = "String")
    })
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Customer login(@RequestParam String username, @RequestParam String password) {
        Customer customer = customerService.login(username,password);
        return customer;
    }
}
