package io.wang.jpa.service;

import io.wang.jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description: TODO
 * @Auther: shanpeng.wang
 * @Create: 2020/12/8 10:44
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;



}
