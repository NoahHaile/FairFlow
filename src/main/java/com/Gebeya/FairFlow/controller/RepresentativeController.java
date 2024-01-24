package com.Gebeya.FairFlow.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/representative")
public class RepresentativeController {
    @PostMapping("/add-user")
    public void addUser(){

    }
}
