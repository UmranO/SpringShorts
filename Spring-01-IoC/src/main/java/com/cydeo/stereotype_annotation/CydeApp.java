package com.cydeo.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CydeApp {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigCourse.class);
        Java java = container.getBean(Java.class);
        java.getTeachingHours();

        Agile agile=container.getBean(Agile.class);
        agile.getTeachingHours();

        Selenium selenium = container.getBean(Selenium.class);
        selenium.getTeachingHours();

    }
}
