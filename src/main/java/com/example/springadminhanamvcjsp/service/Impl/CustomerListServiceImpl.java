package com.example.springadminhanamvcjsp.service.Impl;

import com.example.springadminhanamvcjsp.data.dao.CustomerDAO;
import com.example.springadminhanamvcjsp.data.dto.CustomerResponseDTO;
import com.example.springadminhanamvcjsp.data.dto.PaginationDTO;
import com.example.springadminhanamvcjsp.data.entity.Customer;
import com.example.springadminhanamvcjsp.service.CustomerListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.example.springadminhanamvcjsp.utils.PaginationUtils.getLastRow;
import static com.example.springadminhanamvcjsp.utils.PaginationUtils.getStartRow;

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
        String search = paginationDTO.getSearch() == null ? "%" : "%" + paginationDTO.getSearch() + "%";
        Integer size = paginationDTO.getSize() == null ? 10 : paginationDTO.getSize();
        Integer pageNumber = paginationDTO.getPage() == null ? 1 : paginationDTO.getPage();
        Integer startRow = getStartRow(size, pageNumber);
        Integer lastRow = getLastRow(size, startRow);
        paginationDTO.setSearch(search);
        paginationDTO.setSize(size);
        paginationDTO.setPage(pageNumber);
        paginationDTO.setStartRow(startRow);
        paginationDTO.setLastRow(lastRow);
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
}
