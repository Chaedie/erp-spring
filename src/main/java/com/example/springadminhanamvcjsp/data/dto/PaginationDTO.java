package com.example.springadminhanamvcjsp.data.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaginationDTO {
    private Integer page;
    private Integer size;
    private Integer startRow;
    private Integer lastRow;
    private String search;
    private String orderBy;
    private String ordering;

}
