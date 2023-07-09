package com.example.springadminhanamvcjsp.utils;

public class PaginationUtils {
    public static Integer getStartRow(Integer size, Integer pageNumber) {
        return 1 + (size * (pageNumber - 1));
    }

    public static Integer getLastRow(Integer size, Integer startRow) {
        return startRow + size;
    }
}
