package com.codekul.springCodekul.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

//    @After("pointcut()") //pointcut expration
//    public void Wakeup(){ // this method called advice
//        System.out.println("Wake up");
//    }
//    @Before("pointcut()")
//    public void sleep(){
//        System.out.println("sleep");
//    }
    @Pointcut(value ="execution(* com.codekul.springCodekul.apo2.GirlStudent.*(..))" )
    public void pointcut(){}

    @AfterReturning(value = "execution(public int study(..))",returning = "intValue")
    public void wakeUp(int intValue){
        System.out.println("Wake Up"+ intValue);
    }

    @AfterThrowing(value = "execution(public void exc(..))",throwing = "throwValue")
    public void ShowExc(Exception throwValue){
        System.out.println("throws exceptiom =>" +throwValue);
    }
}
