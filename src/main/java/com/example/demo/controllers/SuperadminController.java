package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SuperadminController {

    @RequestMapping("/api/superadmin")
    public String helloWorld() {
        return "This is super admin";
    }
}

