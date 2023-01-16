package com.codekul.springCodekul.onetomany_3.service.Imp;

import com.codekul.springCodekul.onetomany_3.entity.Country1;
import com.codekul.springCodekul.onetomany_3.repository.Country1Repo;
import com.codekul.springCodekul.onetomany_3.service.Country1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Country1Imp implements Country1Service {

    @Autowired
    private Country1Repo country1Repo;

    @Override
    public String saveCountry1(Country1 country1) {
       country1Repo.save(country1);
       return "saved Country";
    }
}
