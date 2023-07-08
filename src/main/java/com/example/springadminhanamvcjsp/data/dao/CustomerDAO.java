package com.example.springadminhanamvcjsp.data.dao;

import com.example.springadminhanamvcjsp.data.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> findAll();
    
    Customer findById(Long id);
    
    Customer insert(Customer customer);

    Customer updateCustomerDescription(Long number, String description) throws Exception;

    void deleteCustomer(Long id) throws Exception;
}
