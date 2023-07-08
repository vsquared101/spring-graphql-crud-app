package com.learn.graphql.springgraphqlcrudapp.model;

public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;

    public Customer() {
    }

    public Customer(Integer id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName +
                ", lastName=" + lastName + "]";
    }

    public void setId(int i) {
        this.id = i;
    }
}
