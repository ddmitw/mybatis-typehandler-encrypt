package com.ddmit.mybatis.controller;

import com.ddmit.mybatis.entity.Customer;
import com.ddmit.mybatis.mappers.CustomerMapper;
import com.ddmit.mybatis.typehandler.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerMapper customerMapper;

    @GetMapping("addCustomer")
    public String addCustomer(@RequestParam("phone") String phone, @RequestParam("address") String address) {
        int result = customerMapper.addCustomer(new Encrypt(phone), address);
        return "添加结果: " + result;
    }

    @GetMapping("findCustomer")
    public Customer findCustomer(@RequestParam("phone") String phone) {
        return customerMapper.findCustomer(new Encrypt(phone));
    }
}
