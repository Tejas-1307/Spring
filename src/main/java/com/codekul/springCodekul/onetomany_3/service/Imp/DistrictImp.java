package com.codekul.springCodekul.onetomany_3.service.Imp;

import com.codekul.springCodekul.onetomany_3.entity.District;
import com.codekul.springCodekul.onetomany_3.repository.DistrictRepo;
import com.codekul.springCodekul.onetomany_3.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DistrictImp implements DistrictService {

    @Autowired
    private DistrictRepo districtRepo;

    @Override
    public String saveDistrict(District district) {
        districtRepo.save(district);
        return "saved District";
    }
}
