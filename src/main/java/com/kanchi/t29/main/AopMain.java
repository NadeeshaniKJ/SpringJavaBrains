package com.kanchi.t29.main;

import com.kanchi.t29.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring29.xml");
        ShapeService shapeService= ctx.getBean("shapeService", ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
    }
}
