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

    @Autowired
    private AadharRepository aadharRepository;

    @PostMapping("savePerson")
    public String savePerson(@RequestBody Person person){
       Person person1 = new Person();
       person1.setName("Nikhil");
       person1.setAge(12);

       Aadhar aadhar = new Aadhar();
       aadhar.setAadharNumber(8596857485968L);
       aadhar.setNationality("indian");

       person1.setAadhar(aadhar);
       aadhar.setPerson(person1);
       personRepository.save(person1);
       aadharRepository.save(aadhar);
        System.out.println("Hiiii");
       return "person and aadhar saved";
    }


}
