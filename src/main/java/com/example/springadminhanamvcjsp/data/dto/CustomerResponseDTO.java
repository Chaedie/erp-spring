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
    private Long cId;
    private String cName;
    private String cRrn;
    private Character cGender;
    private String cAddress;
    private String cMobile;
    private String cJob;
    private String cDescription;
    private Long eId;
    
    public CustomerResponseDTO(Customer customer) {
        this.cId = customer.getCId();
        this.cName = customer.getCName();
        this.cRrn = customer.getCRrn();
        this.cGender = customer.getCGender();
        this.cAddress = customer.getCAddress();
        this.cMobile = customer.getCMobile();
        this.cJob = customer.getCJob();
        this.cDescription = customer.getCDescription();
        this.eId = customer.getEId();
    }
}
