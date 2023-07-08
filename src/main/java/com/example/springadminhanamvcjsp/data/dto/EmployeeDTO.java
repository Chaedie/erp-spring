package com.example.springadminhanamvcjsp.data.dto;

import com.example.springadminhanamvcjsp.data.entity.Employee;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {
    private Long e_id;
    private String e_name;

    public EmployeeDTO(Employee employee) {
        this.e_id = employee.getE_id();
        this.e_name = employee.getE_name();
    }
}
