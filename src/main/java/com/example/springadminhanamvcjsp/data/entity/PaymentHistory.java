package com.example.springadminhanamvcjsp.data.entity;


import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PaymentHistory {
    private Long pay_id;
    private Long c_id;
    private Timestamp pay_date;
    private Integer pay_amount;
    private String pay_type;
}
