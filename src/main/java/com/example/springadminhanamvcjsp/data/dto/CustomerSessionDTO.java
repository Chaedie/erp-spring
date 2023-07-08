package com.example.springadminhanamvcjsp.data.dto;

import com.example.springadminhanamvcjsp.data.entity.Customer;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerSessionDTO {
    private String c_name;
    private Long c_id;

    public CustomerSessionDTO(Customer customer) {
        this.c_name = customer.getC_name();
        this.c_id = customer.getC_id();
    }

    public static CustomerSessionDTO from(Customer customer) {
        return new CustomerSessionDTO(customer);
    }
}
