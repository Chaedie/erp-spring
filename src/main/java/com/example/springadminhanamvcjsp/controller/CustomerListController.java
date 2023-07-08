package com.example.springadminhanamvcjsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/customerList")
public class CustomerListController {
    
    @GetMapping()
    public String getCustomerList(Model model) {
        return "main";
    }
}
