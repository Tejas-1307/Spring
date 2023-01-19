package com.codekul.springCodekul.aop;

import org.springframework.stereotype.Component;

@Component
public class BoysStudent {

    public int study(int i){
        System.out.println("Boys Student");
        return 23;
    }

    public void exc(String str) throws Exception{
        throw new Exception(str);
    }
}
