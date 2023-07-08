package com.example.springadminhanamvcjsp.data.dto;

import com.example.springadminhanamvcjsp.data.entity.Customer;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerResponseDTO {
    private Long c_id;
    private String c_name;
    private String c_rrn;
    private Character c_gender;
    private String c_address;
    private String c_mobile;
    private String c_job;
    private String c_description;
    private Long e_id;
    
    public CustomerResponseDTO(Customer customer) {
        this.c_id = customer.getC_id();
        this.c_name = customer.getC_name();
        this.c_rrn = customer.getC_rrn();
        this.c_gender = customer.getC_gender();
        this.c_address = customer.getC_address();
        this.c_mobile = customer.getC_mobile();
        this.c_job = customer.getC_job();
        this.c_description = customer.getC_description();
        this.e_id = customer.getE_id();
    }
}
