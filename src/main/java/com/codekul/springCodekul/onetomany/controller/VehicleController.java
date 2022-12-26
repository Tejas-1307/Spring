package com.codekul.springCodekul.onetomany.controller;

import com.codekul.springCodekul.onetomany.entity.Vehicle;
import com.codekul.springCodekul.onetomany.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @PostMapping("saveVahicle")
    public String saveVahicle(@RequestBody Vehicle vehicle){
        vehicleRepository.save(vehicle);
        return "saved..";
    }
}
