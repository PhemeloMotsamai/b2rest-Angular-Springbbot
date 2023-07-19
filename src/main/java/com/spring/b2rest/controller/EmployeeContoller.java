package com.spring.b2rest.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.http.HttpMethod;

@Controller
public class EmployeeContoller {

    @GetMapping("/get")
    public String getEmployees(){
        return "Displaying list of employees";
    }
}
