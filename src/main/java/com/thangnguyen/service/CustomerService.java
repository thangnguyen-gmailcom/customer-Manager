package com.thangnguyen.service;

import com.thangnguyen.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements BaseService{

    static Map<Integer, Customer> customers;

    static int count = 5;

    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"Nguyen Van A","a@gmail.com","address 1"));
        customers.put(2,new Customer(2,"Nguyen Van B","b@gmail.com","address 2"));
        customers.put(3,new Customer(3,"Nguyen Van C","c@gmail.com","address 3"));
        customers.put(4,new Customer(4,"Nguyen Van D","d@gmail.com","address 4"));
        customers.put(5,new Customer(5,"Nguyen Van E","e@gmail.com","address 5"));

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        ++count;
        customer.setId(count);
        customers.put(customer.getId(),customer);
    }

    @Override
    public void update(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void delete(int id) {
        customers.remove(id);
    }
}
