package com.codekul.springCodekul.service_2.controller;

import com.codekul.springCodekul.service_2.entity.Company;
import com.codekul.springCodekul.service_2.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("saveCompany")
    public  String saveCompany(@RequestBody Company company){
        return companyService.saveCompany(company);
    }
}
