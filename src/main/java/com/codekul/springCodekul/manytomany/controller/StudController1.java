package com.codekul.springCodekul.manytomany.controller;

import com.codekul.springCodekul.manytomany.entity.Courses;
import com.codekul.springCodekul.manytomany.entity.Students;
import com.codekul.springCodekul.manytomany.repository.CoursesRepository;
import com.codekul.springCodekul.manytomany.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudController1 {

    @Autowired
    private CoursesRepository coursesRepository;

    @Autowired
    private StudentsRepository studentsRepository;

    @PostMapping("saveStd")
    public String saveStud(@RequestBody Students students){
        studentsRepository.save(students);
        return "Student saved...";
    }

    @PostMapping("saveCourses")
    public String saveCourse(@RequestBody Courses courses){
        coursesRepository.save(courses);
        return "Course saved";
    }
}
