package com.example.springadminhanamvcjsp.service;

import com.example.springadminhanamvcjsp.data.dto.CustomerResponseDTO;
import com.example.springadminhanamvcjsp.data.dto.PaginationDTO;

import java.util.List;

public interface CustomerListService {
    List<CustomerResponseDTO> findAll(); 

    List<CustomerResponseDTO> findAllWithPagination(PaginationDTO paginationDTO);

    Long countTotal();
}
