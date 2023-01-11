package com.codekul.springCodekul.service_2.service;

import com.codekul.springCodekul.service_2.entity.Company;
import com.codekul.springCodekul.service_2.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyImpl implements CompanyService{

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public String saveCompany(Company company) {
        companyRepository.save(company);
        return "saved company...";
    }
}

