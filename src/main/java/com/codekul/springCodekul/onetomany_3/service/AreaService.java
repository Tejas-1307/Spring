package com.codekul.springCodekul.onetomany_3.service;

import com.codekul.springCodekul.onetomany_3.entity.Area;
import com.codekul.springCodekul.onetomany_3.entity.Country1;

import java.util.Map;

public interface AreaService {

    String saveArea(Area area);


//    Map<String, Object> getByPincode(Integer pinCode);

//    Map<String, Object> getReferenceById(Integer pinCode);

    Map<String, Object> getReferenceByPincode(Integer pinCode);
}
