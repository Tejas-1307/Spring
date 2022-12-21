package com.codekul.springCodekul.jpa.repository;

import com.codekul.springCodekul.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


    @Query(value = " select distinct address from student", nativeQuery = true)
    List<String> findDistinctAddress();


    List<Student> findDistinctByAddressAndName(String address, String name);


    List<Student> findByAddressOrName(String address, String name);

    List<Student> findByNameEquals(String name);

    List<Student> findBydobBetween(LocalDate startDate, LocalDate endDate);

    List<Student> findBydobAfter(LocalDate startDate);

    List<Student> findByAgeGreaterThan(Integer age);

    List<Student> findByAgeBetween(Integer startAge, Integer endAge);

    List<Student> findByAgeLessThan(Integer age);

    List<Student> findBydobBefore(LocalDate startDate);

    List<Student> findByNameNotNull();

    List<Student> findByMobileNumberNotNull();

//
}
