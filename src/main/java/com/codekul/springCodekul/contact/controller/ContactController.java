package com.codekul.springCodekul.contact.controller;

import com.codekul.springCodekul.contact.entity.Contact;
import com.codekul.springCodekul.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("saveContact")
    public String saveContact(@RequestBody Contact contact){
        contactRepository.save(contact);
        return "contact saved";
    }

    @GetMapping("getByContactId/{id}")
    public Optional<Contact> getById(@PathVariable Integer id){
        return contactRepository.findById(id);
    }

    @PutMapping("updateContact")
    public  String updateContact(@RequestBody Contact contact){
        Contact contact1 = contactRepository.getReferenceById(contact.getId());
        contact1.setName(contact.getName());
        contact1.setSector(contact.getSector());
        contact1.setEmail(contact.getEmail());
        contact1.setComments(contact.getComments());

        contactRepository.save(contact1);
        return "contact is updated";


    }
}
