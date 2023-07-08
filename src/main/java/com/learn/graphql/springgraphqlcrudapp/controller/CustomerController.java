package com.learn.graphql.springgraphqlcrudapp.controller;

import com.learn.graphql.springgraphqlcrudapp.model.Customer;
import com.learn.graphql.springgraphqlcrudapp.service.CustomerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

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

    @QueryMapping
    public Optional<Customer> findById(@Argument Integer id) {
        return customerService.findById(id);
    }

    @MutationMapping
    public Customer save(@Argument Integer id, @Argument String firstName, @Argument String lastName) {
        return customerService.save(id, firstName, lastName);
    }

    @MutationMapping
    public Customer update(@Argument Integer id, @Argument String firstName, @Argument String lastName) {
        return customerService.update(id, firstName, lastName);
    }

    @MutationMapping
    public Customer deleteById(@Argument Integer id) {
        return customerService.deleteById(id);
    }
}
