package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AdminController {

    @RequestMapping("/api/admin")
    public String helloWorld() {
        return "This is admin";
    }
}
