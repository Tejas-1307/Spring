package com.codekul.springCodekul.manytomany.repository;

import com.codekul.springCodekul.manytomany.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses,Integer> {
}
