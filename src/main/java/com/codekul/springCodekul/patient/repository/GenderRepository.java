package com.codekul.springCodekul.patient.repository;

import com.codekul.springCodekul.patient.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender,Integer> {
}
