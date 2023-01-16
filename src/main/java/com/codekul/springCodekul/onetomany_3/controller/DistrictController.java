package com.codekul.springCodekul.onetomany_3.controller;

import com.codekul.springCodekul.onetomany_3.entity.District;
import com.codekul.springCodekul.onetomany_3.service.DistrictService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @PostMapping("saveDistrict")
    public String saveDistrict(@RequestBody @Valid District district){
        districtService.saveDistrict(district);
        return "saved district";
    }
}
