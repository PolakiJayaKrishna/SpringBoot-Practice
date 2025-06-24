package com.example.demo2;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayStudentDetails {
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody StudentDetails obj) {
        String msg = "Student Name: " + obj.name + " Reg.No: " + obj.regno + " Gender: " + obj.gender + " Year: " + obj.year + " department: " + obj.department;
        return msg;
    }
}
