package com.cydeo.multi_objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    Car car1(){
      Car c =new Car();
      c.setMake("Audi");
      return c;
    }

}
