package com.codekul.springCodekul.onetomany_2.controller;

import com.codekul.springCodekul.onetomany_2.entity.Country;
import com.codekul.springCodekul.onetomany_2.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @PostMapping("saveCountry")
    public String saveCountry(@RequestBody Country country){
        countryRepository.save(country);
        return "save country and states";
    }
}
