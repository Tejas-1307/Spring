package com.codekul.springCodekul.onetomany_3.repository;

import com.codekul.springCodekul.onetomany_3.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface AreaRepo extends JpaRepository<Area,Integer> {

    @Query(value = "select * from country1 as c inner join states1 as st on c.id = st.country_id inner join district as dt on st.id = dt.states1_id inner join taluka as th on dt.id=th.district_id inner joinarea as ar on th.id = ar.taluka_id", nativeQuery = true)


//    List<Map<String, Object>> getReferenceByPincode();

    List<Map<String,Object>> getReferenceWithPincode();
}
