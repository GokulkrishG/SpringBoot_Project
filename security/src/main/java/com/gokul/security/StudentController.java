package com.gokul.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StudentController {
         public List<Student> Students = new ArrayList<>(
         List.of(
                        new Student(1,"Gokul",100),
                        new Student(2,"Rahul",90),
                        new Student(3,"Raj",80)
                ));

         @GetMapping("/students")
         public List<Student> getStudents(){
                 return Students;
         }

         @GetMapping("/csrf")
         public CsrfToken getcsrfToken(HttpServletRequest request) {
                 return (CsrfToken) request.getAttribute("_csrf");
         }

         @PostMapping("/students")
         public Student addStudent(@RequestBody Student student){
                 Students.add(student);
                 return student;
    }
}
