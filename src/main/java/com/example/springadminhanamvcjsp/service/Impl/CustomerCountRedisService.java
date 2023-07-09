package com.example.springadminhanamvcjsp.service.Impl;

import com.example.springadminhanamvcjsp.data.dao.CustomerDAO;
import com.example.springadminhanamvcjsp.data.dto.PaginationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomerCountRedisService {

    private final RedisTemplate<String, String> redisTemplate;
    private final CustomerDAO customerDAO;

    @Autowired
    public CustomerCountRedisService(RedisTemplate<String, String> redisTemplate, CustomerDAO customerDAO) {
        this.redisTemplate = redisTemplate;
        this.customerDAO = customerDAO;
    }

    public Long customerTotalCount(PaginationDTO paginationDTO) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        String search = paginationDTO.getSearch();
        String cachedCount = valueOperations.get(search);
        System.out.println("cachedCount = " + cachedCount);
        Long totalCount = Long.parseLong(Optional.ofNullable(valueOperations.get(search))
                .orElseGet(() -> {
                    String countStr = customerDAO.countTotalByCNameContains(paginationDTO).toString();
                    valueOperations.set(search, countStr);
                    return countStr;
                }));

        return totalCount;
    }

}
