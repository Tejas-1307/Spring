package com.codekul.springCodekul.jpa.controller;

import com.codekul.springCodekul.jpa.entity.Student;
import com.codekul.springCodekul.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")
       public String saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "student saved";
    }

    @PostMapping("saveStudents")
    public String saveStudent(@RequestBody List<Student> student){
        studentRepository.saveAll(student);
        return "student saved";
    }

    @GetMapping("getStudent")
    public List<Student> getStudent(){
        return  studentRepository.findAll();
    }

//    @GetMapping("getById/{id}")
//    public Optional<Student> getStudentById(@PathVariable Integer id){
//        return studentRepository.findById(id);
//    }

    @GetMapping("getById/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return  studentRepository.getReferenceById(id);
    }

    @PutMapping("Update")
    public String updateStudent(@RequestBody Student student){
        Student student1 = studentRepository.getReferenceById(student.getId());
        student1.setAddress(student.getAddress());
        student1.setName(student.getName());
        student1.setMobileNumber(student.getMobileNumber());

        studentRepository.save(student1);
        return "record Updated";
    }

//    @DeleteMapping("delete/{id}")
//    public String deleteStudent(@PathVariable("id") Integer id){
//        studentRepository.deleteById(id);
//        return "record delete";
//    }

    @DeleteMapping("deleteIds/{id}")
    public String deleteStudent(@PathVariable("id") List<Integer> id){
        studentRepository.deleteAllById(id);
        return "records deleted";
    }




}
