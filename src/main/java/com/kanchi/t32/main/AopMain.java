package com.kanchi.t32.main;

import com.kanchi.t32.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring32.xml");
        ShapeService shapeService= ctx.getBean("shapeService", ShapeService.class);
        shapeService.getCircle();
    }
}
