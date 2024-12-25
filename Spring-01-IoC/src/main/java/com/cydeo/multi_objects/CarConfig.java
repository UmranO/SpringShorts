package com.cydeo.multi_objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean (name="c1")
    Car car1(){
      Car c =new Car();
      c.setMake("Audi");
      return c;
    }
    @Bean(name="c2")
    Car c2(){
        Car c=new Car ();
        c.setMake("Tesla");
        return c;
    }

}
