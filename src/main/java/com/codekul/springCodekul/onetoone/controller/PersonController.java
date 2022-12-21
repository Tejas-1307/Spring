package com.codekul.springCodekul.onetoone.controller;

import com.codekul.springCodekul.onetoone.entity.Aadhar;
import com.codekul.springCodekul.onetoone.entity.Person;
import com.codekul.springCodekul.onetoone.repository.AadharRepository;
import com.codekul.springCodekul.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;


    @PostMapping("savePerson")
    public String savePerson(@RequestBody Person person){
        personRepository.save(person);
        return "record saved";
    }


}
