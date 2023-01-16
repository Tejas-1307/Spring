package com.codekul.springCodekul.onetomany_3.controller;

import com.codekul.springCodekul.onetomany_3.entity.Country1;
import com.codekul.springCodekul.onetomany_3.service.Country1Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Country1Controller {

    @Autowired
    private Country1Service country1Service;

    @PostMapping("saveCountry1")
    public String saveCountry1(@RequestBody @Valid Country1 country1){
        country1Service.saveCountry1(country1);
        return "saved country";
    }
}
