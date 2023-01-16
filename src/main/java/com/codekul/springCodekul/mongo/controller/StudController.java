package com.codekul.springCodekul.mongo.controller;


import com.codekul.springCodekul.mongo.modal.Students;
import com.codekul.springCodekul.mongo.repository.Studrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudController {

    @Autowired
    private Studrepo studrepo;

    @PostMapping("/")
    public ResponseEntity<?> addStud(@RequestBody Students students){
        studrepo.save(students);
        return ResponseEntity.ok(students);
    }

    @GetMapping("/")
    public ResponseEntity<?> getStud(@RequestBody Students students){
       studrepo.save(students);
       return ResponseEntity.ok(students);
    }
}
