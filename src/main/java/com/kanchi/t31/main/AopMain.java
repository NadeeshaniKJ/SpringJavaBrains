package com.kanchi.t31.main;

import com.kanchi.t31.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring31.xml");
        ShapeService shapeService= ctx.getBean("shapeService", ShapeService.class);
        shapeService.getCircle().setNameandReturn("dummy name");
        shapeService.getCircle().setName("dummy name");
        System.out.println(shapeService.getCircle().getName());
    }
}
