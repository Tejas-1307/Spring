package com.codekul.springCodekul.jpa.controller;

import com.codekul.springCodekul.jpa.entity.Student;
import com.codekul.springCodekul.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")
       public String saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "student saved";
    }

    @GetMapping("getStudent")
    public List<Student> getStudent(){
        return  studentRepository.findAll();
    }



}
