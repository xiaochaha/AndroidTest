
package com.avocado.service;

import com.avocado.entity.Customer;

public interface CustomerService {


    //用户登录
    public Customer login(String username, String password);
    //用户注册
    public void register(Customer customer);

}
