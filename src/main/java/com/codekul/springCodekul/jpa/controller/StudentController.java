package com.codekul.springCodekul.jpa.controller;

import com.codekul.springCodekul.jpa.entity.Student;
import com.codekul.springCodekul.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

//    @PostMapping("saveStudent")
//       public String saveStudent(@RequestBody Student student){
//        studentRepository.save(student);
//        return "student saved";
//    }

    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody Student student){
        Student student1 = new Student();
        student1.setMobileNumber(student.getMobileNumber());
        student1.setDob(student.getDob());
        student1.setName(student.getName());
        student1.setAddress(student.getAddress());
        Period period = Period.between(student.getDob(),LocalDate.now());
        int age = period.getYears();
        student1.setAge(age);
        studentRepository.save(student1);
        return "student saved";
    }


    @PostMapping("saveStudents")
    public String saveStudent(@RequestBody List<Student> student){
        studentRepository.saveAll(student);
        return "student saved";
    }

    @GetMapping("getStudent")
    public List<Student> getStudent(){
        return  studentRepository.findAll();
    }

//    @GetMapping("getById/{id}")
//    public Optional<Student> getStudentById(@PathVariable Integer id){
//        return studentRepository.findById(id);
//    }

    @GetMapping("getById/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return  studentRepository.getReferenceById(id);
    }

    @PutMapping("Update")
    public String updateStudent(@RequestBody Student student){
        Student student1 = studentRepository.getReferenceById(student.getId());
        student1.setAddress(student.getAddress());
        student1.setName(student.getName());
        student1.setMobileNumber(student.getMobileNumber());

        studentRepository.save(student1);
        return "record Updated";
    }

    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable("id") Integer id){
        studentRepository.deleteById(id);
        return "record delete";
    }

    @DeleteMapping("deleteIds/{id}")
    public String deleteStudent(@PathVariable("id") List<Integer> id){
        studentRepository.deleteAllById(id);
        return "records deleted";
    }

    @PostMapping("deleteByObject/{id}")
    public String deleteStudent(@RequestBody Student student){
        studentRepository.delete(student);
        return "record deleted";
    }

//    @GetMapping("getByAddress/{address}/{name}")
//    public List<Student> getByAddress(@PathVariable("address") String address,
//                                      @PathVariable("name") String name){
//        return studentRepository.findDistinctByAddressAndName(address,name);
//    }

    @GetMapping("getAddress")
    public List<String> getAddress(){
        return studentRepository.findDistinctAddress();
    }

    @GetMapping("getByAddress/{address}/{name}")
    public List<Student> getByAddress (@PathVariable("address") String address,@PathVariable("name") String name){
        return studentRepository.findByAddressOrName(address,name);
    }

    @GetMapping("getByName/{name}")
    public List<Student> getByName(@PathVariable("name") String name){
        return studentRepository.findByNameEquals(name);
    }

    @GetMapping("getStudentByDob/{startDate}/{endDate}")
    public List<Student> getStudentByDob(@PathVariable LocalDate startDate,@PathVariable LocalDate endDate) {
        return studentRepository.findBydobBetween(startDate,endDate);
    }

    @GetMapping("getStudentDobAfter/{startDate}")
    public List<Student> getStudentDobAfter(@PathVariable("startDate") LocalDate startDate){
        return studentRepository.findBydobAfter(startDate);
    }

    @GetMapping("getStudentDobBefore/{startDate}")
    public List<Student> getStudentDobBefore(@PathVariable("startDate") LocalDate startDate){
        return studentRepository.findBydobBefore(startDate);
    }

    @GetMapping ("getStudentDobGreater/{age}")
    public List<Student> getStudentDobGreater(@PathVariable("age") Integer age){
        return studentRepository.findByAgeGreaterThan(age);
    }

    @GetMapping("getByLessAge/{age}")
    public List<Student> getByLessAge(@PathVariable ("age") Integer age){
        return studentRepository.findByAgeLessThan(age);
    }

    @GetMapping ("getStudentAgeBetween/{startAge}/{endAge}")
    public List<Student> getStudentAgeBetween(@PathVariable("startAge") Integer startAge,
                                              @PathVariable("endAge") Integer endAge){
        return studentRepository.findByAgeBetween(startAge,endAge);
    }





}
