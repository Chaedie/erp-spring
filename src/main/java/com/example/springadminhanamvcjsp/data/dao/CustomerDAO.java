package com.example.springadminhanamvcjsp.data.dao;

import com.example.springadminhanamvcjsp.data.dto.PaginationDTO;
import com.example.springadminhanamvcjsp.data.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerDAO {
    List<Customer> findAll();
    
    List<Customer> findAllWithPagination(PaginationDTO paginationDTO);

    Customer findById(Long id);

    Customer insert(Customer customer);

    Customer updateCustomerDescription(Long number, String description) throws Exception;

    void deleteCustomer(Long id) throws Exception;

    Long countTotal();
}
