package com.example.springadminhanamvcjsp.data.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    @Id
    @GeneratedValue
    private Long acc_id;
    private Long acc_cid;
    private Timestamp acc_date;
    private Integer acc_balance;
    private String acc_password;
    private Long acc_pid;
    private String acc_p_category;
    private String acc_pname;
    private Double acc_interestrate;
    private Integer acc_collateralvalue;
    private Integer acc_interest_day;
    private Integer acc_contract_month;
    private Timestamp acc_maturitydate;
    private Character acc_isactive;
}
