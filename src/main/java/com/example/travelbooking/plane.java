package com.example.travelbooking;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class plane {
    @GetMapping("/myplane")
    public String getData(){

        return "Please book your ticket from website.";
    }
}
