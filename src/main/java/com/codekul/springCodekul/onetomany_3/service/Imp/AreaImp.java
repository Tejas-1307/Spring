package com.codekul.springCodekul.onetomany_3.service.Imp;

import com.codekul.springCodekul.onetomany_3.entity.Area;
import com.codekul.springCodekul.onetomany_3.entity.Country1;
import com.codekul.springCodekul.onetomany_3.repository.AreaRepo;
import com.codekul.springCodekul.onetomany_3.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaImp implements AreaService {
    
    @Autowired
    private AreaRepo areaRepo;

    @Override
    public String saveArea(Area area) {
        areaRepo.save(area);
        return "saved area";
    }
}
