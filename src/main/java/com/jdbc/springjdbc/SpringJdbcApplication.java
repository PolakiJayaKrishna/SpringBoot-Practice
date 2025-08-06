package com.jdbc.springjdbc;



import com.jdbc.springjdbc.model.Student;
import com.jdbc.springjdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;


@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {

        ApplicationContext context =  SpringApplication.run(SpringJdbcApplication.class, args);

        Student s = context.getBean(Student.class);
        s.setRegNo(40690);
        s.setName("JayaKrishna");
        s.setMarks(100);

        StudentService service = context.getBean(StudentService.class);


        service.addStudent(s);

        List<Student> students = service.getStudents();
        System.out.println(students);

        
    }

}