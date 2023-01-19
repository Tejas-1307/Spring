package com.codekul.springCodekul.onetomany_3.controller;

import com.codekul.springCodekul.onetomany_3.entity.City;
import com.codekul.springCodekul.onetomany_3.service.CityService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("saveCity")
    public String saveCity(@RequestBody @Valid City city){
        cityService.saveCity(city);
        return "saved city";
    }
}
