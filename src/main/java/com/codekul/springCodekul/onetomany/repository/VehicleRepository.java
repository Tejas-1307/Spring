package com.codekul.springCodekul.onetomany.repository;

import com.codekul.springCodekul.onetomany.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

}
