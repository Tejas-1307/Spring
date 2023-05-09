package com.codekul.springCodekul.patient.repository;

import com.codekul.springCodekul.patient.entity.Prefix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrefixRepo extends JpaRepository<Prefix,Integer> {
}
