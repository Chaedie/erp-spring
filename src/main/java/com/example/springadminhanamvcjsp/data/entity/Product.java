package com.example.springadminhanamvcjsp.data.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private Long p_id;
    private String p_category;
    private String p_name;
    private String p_description;
    private Double p_interestrate;
    private Integer p_intrest_day;
    private Timestamp p_date;
    private Integer p_contract_month;
    private Character p_isactive;
    private Integer p_limit;
    private Double p_collateralrate;
    private Integer p_mincreditgrade;
    private String p_jobtype;
}
