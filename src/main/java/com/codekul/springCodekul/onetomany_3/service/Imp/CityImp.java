package com.codekul.springCodekul.onetomany_3.service.Imp;

import com.codekul.springCodekul.onetomany_3.entity.City;
import com.codekul.springCodekul.onetomany_3.repository.CityRepo;
import com.codekul.springCodekul.onetomany_3.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityImp implements CityService {

    @Autowired
    private CityRepo cityRepo;


    @Override
    public String saveCity(City city) {
        cityRepo.save(city);
        return "city saved";
    }
}
