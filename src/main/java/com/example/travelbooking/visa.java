package com.example.travelbooking;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {
    @GetMapping("/myvisa")

    public String getData(){

        return "Visa is available for all the passenger";
    }

}
