package com.kanchi.t34.main;

import com.kanchi.t34.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring34.xml");
        ShapeService shapeService= ctx.getBean("shapeService", ShapeService.class);
        shapeService.getCircle();
    }
}
