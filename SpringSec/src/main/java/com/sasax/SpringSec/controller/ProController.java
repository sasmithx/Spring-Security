package com.sasax.SpringSec.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProController {

    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "Welcome to Spring Security "+ request.getSession().getId();
    }


}
