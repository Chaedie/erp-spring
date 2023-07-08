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
@Builder
public class Transaction {
    @Id
    @GeneratedValue
    private Long t_id;
    private Long t_accid;
    private Long t_counterpart_id;
    private Character t_type;
    private Timestamp t_date;
    private Integer t_amount;
    private String t_description;
    private Character t_status;
    private Integer t_balance;
}
