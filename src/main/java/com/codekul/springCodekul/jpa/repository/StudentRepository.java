package com.codekul.springCodekul.jpa.repository;

import com.codekul.springCodekul.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
