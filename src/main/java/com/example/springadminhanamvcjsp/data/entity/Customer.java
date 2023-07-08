package com.example.springadminhanamvcjsp.data.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue
    private Long c_id;
    private String c_name;
    private String c_rrn;
    private Character c_gender;
    private String c_address;
    private String c_mobile;
    private String c_job;
    private String c_description;
    private Long e_id;
}
