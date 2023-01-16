package com.codekul.springCodekul.onetomany_3.service.Imp;

import com.codekul.springCodekul.onetomany_3.entity.Taluka;
import com.codekul.springCodekul.onetomany_3.repository.TalukaRepo;
import com.codekul.springCodekul.onetomany_3.service.TalukaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TalukaImp implements TalukaService {

    @Autowired
    private TalukaRepo talukaRepo;

    @Override
    public String saveTaluka(Taluka taluka) {
        talukaRepo.save(taluka);
        return "saved taluka";
    }
}
