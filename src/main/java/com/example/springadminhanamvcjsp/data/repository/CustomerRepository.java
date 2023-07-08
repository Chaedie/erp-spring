package com.example.springadminhanamvcjsp.data.repository;

import com.example.springadminhanamvcjsp.data.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    

}
