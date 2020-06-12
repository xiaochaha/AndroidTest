package com.avocado.serviceImpl;

import com.avocado.dao.CustomerMapper;
import com.avocado.entity.Customer;
import com.avocado.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description:
 * @author: ash
 * @create: 2020/06/11 21:45
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer login(String username, String password) {
        Customer customer=customerMapper.login(username,password);
        return customer;
    }

    @Override
    public void register(Customer customer) {

    }
}
