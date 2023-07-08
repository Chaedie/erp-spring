package com.example.springadminhanamvcjsp.service;

import com.example.springadminhanamvcjsp.data.dto.CustomerResponseDTO;

import java.util.List;

public interface CustomerListService {
    List<CustomerResponseDTO> findAll(); 
}
