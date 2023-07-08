package com.learn.graphql.springgraphqlcrudapp.service;

import com.learn.graphql.springgraphqlcrudapp.model.Customer;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final List<Customer> customers = new ArrayList<>();

    public List<Customer> findAll() {
        return customers;
    }

    public Optional<Customer> findById(Integer id) {
        return customers.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    public Customer save(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public Customer update(Customer customer) {
        customers.removeIf(c -> c.getId().equals(customer.getId()));
        customers.add(customer);
        return customer;
    }

    public Customer deleteById(Integer id) {
        Optional<Customer> customer = findById(id);
        customer.ifPresent(customers::remove);
        return customer.orElse(null);
    }

    @PostConstruct
    private void initCustomer() {
        customers.add(new Customer(1, "John", "Doe"));
        customers.add(new Customer(2, "Jane", "Doe"));
        customers.add(new Customer(3, "John", "Wick"));
    }
}
