package com.example.springadminhanamvcjsp.data.repository;

import com.example.springadminhanamvcjsp.data.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(nativeQuery = true,
            value =
                    "select * from (" +
                            "   select rownum as rownumber, " +
                            "           ordered_customer.* from (" +
                            "               select * from customer " +
                            "               where c_name like ?1 " +
                            "               order by c_id desc ) ordered_customer ) " +
                            " where rownumber >= ?2 and rownumber < ?3")
    List<Customer> findAllWithPagination(String search, Integer startRow, Integer lastRow);

    @Query(nativeQuery = true,
            value = "select count(c_name) from customer where c_name like ?1")
    Long countCustomerByCNameContains(String search);

}
