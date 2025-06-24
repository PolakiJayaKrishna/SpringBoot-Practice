package com.example.demo1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayStudentDetails {
    @GetMapping("/student")
    public StudentDetails displayStudentDetails() {
        StudentDetails obj = new StudentDetails();
        obj.name = "Jayakrishna";
        obj.regno = 99220040690L;
        obj.department = "Computer Science";
        obj.year = 4;
        return obj;
    }
}
