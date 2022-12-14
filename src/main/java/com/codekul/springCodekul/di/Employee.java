package com.codekul.springCodekul.di;

import io.micrometer.observation.Observation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Component
//@Scope(SCOPE_SINGLETON)//it create only one object by default SINGLETON.
@Scope(SCOPE_PROTOTYPE) //it create two object.
public class Employee {

    public void show(){
        System.out.println("in employee show");
    }

    public  Employee(){
        System.out.println("Employee constructor");
    }
}
