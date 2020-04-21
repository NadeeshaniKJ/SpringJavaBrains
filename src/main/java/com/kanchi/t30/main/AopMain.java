package com.kanchi.t30.main;

import com.kanchi.t30.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring30.xml");
        ShapeService shapeService= ctx.getBean("shapeService", ShapeService.class);
        shapeService.getCircle().setName("dummy name");
        System.out.println(shapeService.getCircle().getName());
    }
}
