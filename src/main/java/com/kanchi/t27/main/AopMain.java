package com.kanchi.t27.main;

import com.kanchi.t27.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring27.xml");
        ShapeService shapeService= ctx.getBean("shapeService", ShapeService.class);
        System.out.println(shapeService.getTriangle().getName());


    }
}
