package com.codekul.springCodekul.manytomany.repository;

import com.codekul.springCodekul.manytomany.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Integer> {
}
