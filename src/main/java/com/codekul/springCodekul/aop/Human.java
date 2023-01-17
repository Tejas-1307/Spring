package com.codekul.springCodekul.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

    @After("execution(* com.codekul.springCodekul.apo2.GirlStudent.*(..))") //pointcut expration
    public void Wakeup(){
        System.out.println("Wake up");
    }
}
