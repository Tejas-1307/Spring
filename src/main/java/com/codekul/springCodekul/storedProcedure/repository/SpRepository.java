package com.codekul.springCodekul.storedProcedure.repository;

import com.codekul.springCodekul.onetomany.entity.Vehicle;
//import com.codekul.springCodekul.storedProcedure.Entity.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface SpRepository extends JpaRepository<Vehicle,Long> {

    @Query(value = "{call getVehicleData()}",nativeQuery = true)
    List<Map<String, String>> getVehicle();
}
