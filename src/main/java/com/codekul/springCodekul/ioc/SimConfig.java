package com.codekul.springCodekul.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {

    @Bean
    public Vodafone getObj(){
        return new Vodafone();

    }
    @Bean
    public Jio getObj1(){
        return new Jio();
    }

}
