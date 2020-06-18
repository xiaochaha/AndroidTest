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
        return customerMapper.login(username,password);
    }

    @Override
    public int register(Customer customer) {
        try {
            return customerMapper.register(customer);
        }catch (Exception e){
            System.out.println(e.toString());
            return 0;
        }
    }
}
