package com.example.demo0;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class College {
    @GetMapping("/Welcome")
    public String Welcome(){
        return "Welcome to KARE...";
    }
}
