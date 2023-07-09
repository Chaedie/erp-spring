package com.example.springadminhanamvcjsp.controller;

import com.example.springadminhanamvcjsp.data.dto.CustomerResponseDTO;
import com.example.springadminhanamvcjsp.data.dto.PaginationDTO;
import com.example.springadminhanamvcjsp.service.CustomerListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/customerList")
public class CustomerListController {

    private final CustomerListService customerListService;

    @Autowired
    public CustomerListController(CustomerListService customerListService) {
        this.customerListService = customerListService;
    }

    @GetMapping()
    public String getCustomerList(Model model,
                                  @RequestParam(value = "size", defaultValue = "10") String size,
                                  @RequestParam(value = "page", defaultValue = "1") String page,
                                  @RequestParam(value = "search", required = false) String search) {
        List<CustomerResponseDTO> customerResponseDTOList = customerListService.findAllWithPagination(
                new PaginationDTO().builder()
                        .page(Integer.parseInt(page))
                        .size(Integer.parseInt(size))
                        .search(search)
                        .build());
        Long customerTotalCount = customerListService.countTotal();

        model.addAttribute("customerList", customerResponseDTOList);
        model.addAttribute("customerCount", customerTotalCount);

        return "customerList";
    }
}
