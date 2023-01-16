package com.codekul.springCodekul.onetomany_3.controller;

import com.codekul.springCodekul.onetomany_3.entity.Taluka;
import com.codekul.springCodekul.onetomany_3.service.TalukaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TalukaController {

    @Autowired
    private TalukaService talukaService;

    @PostMapping("saveTaluka")
    public String saveTaluka(@RequestBody @Valid Taluka taluka){
        talukaService.saveTaluka(taluka);
        return "saved Taluka";
    }
}
