package com.codekul.springCodekul.storedProcedure.controller;

import com.codekul.springCodekul.storedProcedure.repository.SpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SpController {

    @Autowired
    private SpRepository spRepository;

    @GetMapping("getData")
    public List<Map<String,String>> getDate(){
        return spRepository.getVehicle();
    }

//    mysql> delimiter /
//    mysql> create procedure getVehicleData()
//    -> BEGIN
//    -> select * from vehicle;
//    -> END;
//    -> /

//    call getVehicleData();/
}
