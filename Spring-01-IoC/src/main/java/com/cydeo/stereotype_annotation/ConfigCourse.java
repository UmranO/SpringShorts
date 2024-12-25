package com.cydeo.stereotype_annotation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //(basePackages = "com.cydeo")    Sonradan commented out bec. hem bunsuz baska package da olan bir class'in
public class ConfigCourse {                    //search edilmeyecegini gostermek hem de dependency_injection package'daki
                                               //java ile interfere edecegi icin
}
