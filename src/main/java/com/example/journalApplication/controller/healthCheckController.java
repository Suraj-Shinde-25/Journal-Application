package com.example.journalApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheckController {
    @GetMapping("/health-check")
    public String checkHealth(){
        return "Ok";
    }
}
