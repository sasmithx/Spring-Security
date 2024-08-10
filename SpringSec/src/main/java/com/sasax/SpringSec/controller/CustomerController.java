package com.sasax.SpringSec.controller;

import com.sasax.SpringSec.model.Customer;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private List<Customer> customers = new ArrayList<Customer>(List.of(
            new Customer(1,"Sasmith","Galle"),
            new Customer(2,"Nimashi","Galle")
    ));

    @GetMapping("/customer")
    public List<Customer> getCustomers() {
        return customers;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }


    @PostMapping("/customer")
     public Customer addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return customer;
     }
}
