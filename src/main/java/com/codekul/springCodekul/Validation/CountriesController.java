package com.codekul.springCodekul.Validation;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesController {

    @Autowired
    private CountryRepo countryRepo;

    @PostMapping("saveCountries")
    public String saveCountries(@RequestBody @Valid Countries countries){
        countryRepo.save(countries);
        return "country saved";
    }
}
