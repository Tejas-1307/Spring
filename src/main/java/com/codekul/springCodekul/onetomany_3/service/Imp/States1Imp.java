package com.codekul.springCodekul.onetomany_3.service.Imp;

import com.codekul.springCodekul.onetomany_3.entity.States1;
import com.codekul.springCodekul.onetomany_3.repository.States1Repo;
import com.codekul.springCodekul.onetomany_3.service.States1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class States1Imp implements States1Service {

    @Autowired
    private States1Repo states1Repo;

    @Override
    public String saveStates1(States1 states1) {
        states1Repo.save(states1);
        return "saved state";


    }
}
