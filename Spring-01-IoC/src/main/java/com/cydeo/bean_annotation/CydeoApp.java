package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

   ApplicationContext container= new AnnotationConfigApplicationContext(ConfigApp.class,AnotherConfigApp.class); //Here we are giving the Configuration CLass
                                                                                          //where we mention our beans are

        FullTimeMentor fullTimeMentor = container.getBean(FullTimeMentor.class);          //Here we are giving the CLass name that we
        fullTimeMentor.createAccount();                                                                                     //want to create the bean from

        PartTimeMentor partTimeMentor = container.getBean(PartTimeMentor.class);
        partTimeMentor.createAccount();


        String s = container.getBean(String.class);
        Integer int1 = container.getBean(Integer.class);

        System.out.println(s);
        System.out.println(int1);
    }

}
