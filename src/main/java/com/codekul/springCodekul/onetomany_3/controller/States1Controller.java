package com.codekul.springCodekul.onetomany_3.controller;

import com.codekul.springCodekul.onetomany_3.entity.States1;
import com.codekul.springCodekul.onetomany_3.service.States1Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class States1Controller {

    @Autowired
    private States1Service states1Service;

    @PostMapping("saveStates1")
    public String saveStates1(@RequestBody @Valid States1 states1){
        states1Service.saveStates1(states1);
        return "saved states";
    }
}
