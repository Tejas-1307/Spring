package com.codekul.springCodekul.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Company {
    @Autowired
    private Employee employee;
    @Autowired
    private Employee employee1;

//    public Company(Employee employee) {
//        this.employee = employee;
//    }

    public Company(){
        System.out.println("Company Constructor");
    }

    public void display(){
        employee.show();
        employee.show();
    }


}
