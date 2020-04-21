package com.kanchi.t33.main;

import com.kanchi.t33.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring33.xml");
        ShapeService shapeService= ctx.getBean("shapeService", ShapeService.class);
        shapeService.getCircle();
    }
}
