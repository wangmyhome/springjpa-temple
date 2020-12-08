package io.wang.jpa.controller;

import io.wang.jpa.entity.Customer;
import io.wang.jpa.repository.CustomerRepository;
import io.wang.jpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Auther: shanpeng.wang
 * @Create: 2020/12/8 10:44
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;



    @RequestMapping("/delete")
    public String delete (@RequestBody(required = true) Customer customer){
        customerRepository.delete(customer);
        return "success";
    }


    @RequestMapping("/delete")
    public String deleteObj(@RequestBody(required = true) Customer customer){
        customerRepository.delete(customer);
        return "success";
    }
    @RequestMapping("/save")
    public String save(@RequestBody(required = true)Customer customer){
        customerRepository.save(customer);
        return "success";
    }

}
