package com.learn.graphql.springgraphqlcrudapp.controller;

import com.learn.graphql.springgraphqlcrudapp.model.Customer;
import com.learn.graphql.springgraphqlcrudapp.service.CustomerService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @QueryMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }
}
