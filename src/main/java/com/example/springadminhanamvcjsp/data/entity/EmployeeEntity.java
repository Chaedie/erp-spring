package com.example.springadminhanamvcjsp.data.entity;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {
    private Integer e_id;
    private String e_password;
    private String e_name;
}