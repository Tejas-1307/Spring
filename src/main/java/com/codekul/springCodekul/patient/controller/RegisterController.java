package com.codekul.springCodekul.patient.controller;

import com.codekul.springCodekul.patient.entity.*;
import com.codekul.springCodekul.patient.repository.GenderRepository;
import com.codekul.springCodekul.patient.repository.PrefixGenderMappingRepo;
import com.codekul.springCodekul.patient.repository.PrefixRepo;
import com.codekul.springCodekul.patient.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    private RegistrationRepo registrationRepo;

    @Autowired
    private GenderRepository genderRepository;

    @Autowired
    private PrefixRepo prefixRepo;

    @Autowired
    private PrefixGenderMappingRepo prefixGenderMappingRepo;

    @PostMapping("saveGender")
    public String saveGender(@RequestBody Gender gender){
        genderRepository.save(gender);
        return "Gender saved";
    }


    @PostMapping("savePrefix")
    public String savePrefix(@RequestBody Prefix prefix){
        Prefix prefix1= prefixRepo.save(prefix);

        PrefixGenderMappingId prefixGenderMappingId = new PrefixGenderMappingId();
        prefixGenderMappingId.setPrefixId(prefix1.getId());
        prefixGenderMappingId.setGenderId(prefix1.getGender());

        PrefixGenderMapping prefixGenderMapping = new PrefixGenderMapping();
        prefixGenderMapping.setPrefixGenderMappingId(prefixGenderMappingId);
        prefixGenderMappingRepo.save(prefixGenderMapping);
        return "saved Prefix";
    }

    @PostMapping("saveRegister")
    public String saveRegister (@RequestBody Registration registration){
        registrationRepo.save(registration);
        return "registration saved";
    }
}
