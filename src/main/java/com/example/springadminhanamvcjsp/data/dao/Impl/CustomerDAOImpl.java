package com.example.springadminhanamvcjsp.data.dao.Impl;

import com.example.springadminhanamvcjsp.data.dao.CustomerDAO;
import com.example.springadminhanamvcjsp.data.dto.PaginationDTO;
import com.example.springadminhanamvcjsp.data.entity.Customer;
import com.example.springadminhanamvcjsp.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDAOImpl implements CustomerDAO {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerDAOImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = customerRepository.findAll();

        return customerList;
    }

    @Override
    public List<Customer> findAllWithPagination(PaginationDTO paginationDTO) {
        String search = paginationDTO.getSearch();
        Integer startRow = paginationDTO.getStartRow();
        Integer lastRow = paginationDTO.getLastRow();
        System.out.println("search = " + search);
        System.out.println("startRow = " + startRow);
        System.out.println("lastRow = " + lastRow);
        List<Customer> customerList = customerRepository.findAllWithPagination(search, startRow, lastRow);
        System.out.println("customerList = " + customerList);

        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public Customer insert(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomerDescription(Long number, String description) throws Exception {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) throws Exception {

    }

    @Override
    public Long countTotal() {
        Long total = customerRepository.count();

        return total;
    }
}
