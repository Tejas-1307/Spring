package com.codekul.springCodekul.onetomany_3.service.Imp;

import com.codekul.springCodekul.onetomany_3.entity.Area;
import com.codekul.springCodekul.onetomany_3.entity.Country1;
import com.codekul.springCodekul.onetomany_3.repository.AreaRepo;
import com.codekul.springCodekul.onetomany_3.service.AreaService;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.codekul.springCodekul.util.Constants.*;

@Service
public class AreaImp implements AreaService {
    
    @Autowired
    private AreaRepo areaRepo;

    @Override
    public String saveArea(Area area) {
        areaRepo.save(area);
        return "saved area";
    }


    @Override
    public Map<String, Object> getReferenceByPincode(Integer pinCode) {
        Map<String,Object> map = new HashMap<>();
        map.put(MESSAGE,"Get All ");
        map.put(STATUS, HttpStatus.CREATED.value());
        map.put(RESULT,areaRepo.getReferenceWithPincode());
        return map;
    }




}
