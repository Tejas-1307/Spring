package com.codekul.springCodekul.contact.repository;

import com.codekul.springCodekul.contact.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
