package com.example.springadminhanamvcjsp.service.Impl;

import com.example.springadminhanamvcjsp.data.dao.CustomerDAO;
import com.example.springadminhanamvcjsp.data.dto.CustomerResponseDTO;
import com.example.springadminhanamvcjsp.data.dto.PaginationDTO;
import com.example.springadminhanamvcjsp.data.entity.Customer;
import com.example.springadminhanamvcjsp.service.CustomerListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerListServiceImpl implements CustomerListService {

    private final CustomerDAO customerDAO;

    @Autowired
    public CustomerListServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public List<CustomerResponseDTO> findAll() {
        List<Customer> customerList = customerDAO.findAll();
        List<CustomerResponseDTO> customerResponseDTOList = new ArrayList<>();

        for (Customer customer : customerList) {
            CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO(customer);
            customerResponseDTOList.add(customerResponseDTO);
        }

        return customerResponseDTOList;
    }

    @Override
    public List<CustomerResponseDTO> findAllWithPagination(PaginationDTO paginationDTO) {

        List<Customer> customerList = customerDAO.findAllWithPagination(paginationDTO);
        List<CustomerResponseDTO> customerResponseDTOList = new ArrayList<>();

        for (Customer customer : customerList) {
            CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO(customer);
            customerResponseDTOList.add(customerResponseDTO);
        }
        return customerResponseDTOList;
    }

    @Override
    public Long countTotal() {
        Long total = customerDAO.countTotal();

        return total;
    }

    @Override
    public Long countTotalByCNameContains(PaginationDTO paginationDTO) {
        Long total = customerDAO.countTotalByCNameContains(paginationDTO);

        return total;
    }
}
