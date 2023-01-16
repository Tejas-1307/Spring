package com.codekul.springCodekul.onetomany_3.repository;

import com.codekul.springCodekul.onetomany_3.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository<City,Integer> {

}
