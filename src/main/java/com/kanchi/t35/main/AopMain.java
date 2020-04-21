package com.kanchi.t35.main;

import com.kanchi.t35.service.FactoryService;
import com.kanchi.t35.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring34.xml");
//        ShapeService shapeService= ctx.getBean("shapeService", ShapeService.class);

        FactoryService factoryService =new FactoryService();
        ShapeService shapeService = (ShapeService) factoryService.getBean("ShapeService");

        shapeService.getCircle();
    }
}
