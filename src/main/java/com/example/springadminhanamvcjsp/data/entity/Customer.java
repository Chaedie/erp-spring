package com.example.springadminhanamvcjsp.data.entity;

import lombok.*;

import javax.persistence.*;

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
    private Long cId;
    private String cName;
    private String cRrn;
    private Character cGender;
    private String cAddress;
    private String cMobile;
    private String cJob;
    private String cDescription;
    private Long eId;
}
