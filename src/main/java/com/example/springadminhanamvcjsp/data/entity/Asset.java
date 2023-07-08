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
public class Asset {
    @Id
    @GeneratedValue
    private Long ass_id;
    
    private Long c_id;
    private Integer ass_stock;
    private Integer ass_bond;
    private Integer ass_realestate;
    private Integer ass_deposit;
    private Integer ass_savings;
    private Integer ass_loan;
    private Integer ass_total;
    private Timestamp ass_lastupdate;
}
