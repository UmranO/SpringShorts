package com.cydeo.dependency_injection;

import com.cydeo.stereotype_annotation.ConfigCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigCourse.class);
    }
}

