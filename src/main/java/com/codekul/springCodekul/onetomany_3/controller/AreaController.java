package com.codekul.springCodekul.onetomany_3.controller;

import com.codekul.springCodekul.onetomany_3.entity.Area;
import com.codekul.springCodekul.onetomany_3.service.AreaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;

    @PostMapping("saveArea")
    public String saveArea(@RequestBody @Valid Area area){
        areaService.saveArea(area);
        return "saved Area";
    }

    @GetMapping("getByPincode")
    public Map<String,Object> getByPincode(@PathVariable("pinCode") Integer pinCode){
        return areaService.getReferenceByPincode(pinCode);
    }
}
