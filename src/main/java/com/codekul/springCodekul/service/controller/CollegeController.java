package com.codekul.springCodekul.service.controller;

import com.codekul.springCodekul.service.entity.College;
import com.codekul.springCodekul.service.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @PostMapping("saveCollege")
    public String saveCollege(@RequestBody College college){
        return collegeService.saveCollege(college);
    }


}
