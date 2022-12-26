package com.codekul.springCodekul.onetomany_2.repository;

import com.codekul.springCodekul.onetomany_2.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Integer> {
}
