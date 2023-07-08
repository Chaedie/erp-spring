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
public class Specific {
    @Id
    @GeneratedValue
    private Long c_id;
    private String spc_rank;
    private Integer spc_creditrank;
}
