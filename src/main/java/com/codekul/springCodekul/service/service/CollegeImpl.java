package com.codekul.springCodekul.service.service;

import com.codekul.springCodekul.service.controller.CollegeController;
import com.codekul.springCodekul.service.entity.College;
import com.codekul.springCodekul.service.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeImpl implements CollegeService{

    @Autowired
    private CollegeRepository collegeRepository;


    @Override
    public String saveCollege(College college) {
        collegeRepository.save(college);
        return "saved college..";
    }
}

