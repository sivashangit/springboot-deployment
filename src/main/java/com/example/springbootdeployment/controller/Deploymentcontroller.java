package com.example.springbootdeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Deploymentcontroller {

    @GetMapping
    public String welcome(){

        return "welcome to ms deployment";
    }
}
