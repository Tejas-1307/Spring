package com.codekul.springCodekul.service_2.repository;

import com.codekul.springCodekul.service_2.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
