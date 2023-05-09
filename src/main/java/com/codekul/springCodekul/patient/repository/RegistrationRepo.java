package com.codekul.springCodekul.patient.repository;

import com.codekul.springCodekul.patient.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration,Integer> {
}
