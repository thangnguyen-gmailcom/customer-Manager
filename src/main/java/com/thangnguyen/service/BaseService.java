package com.thangnguyen.service;

import com.thangnguyen.model.Customer;

import java.util.List;

public interface BaseService {

    List<Customer> findAll();

    void save(Customer customer);

    void update(Customer customer);

    Customer findById(int id);

    void delete(int id);
}
