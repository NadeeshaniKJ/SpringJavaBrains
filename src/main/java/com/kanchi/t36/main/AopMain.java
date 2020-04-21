package com.kanchi.t36.main;

import com.kanchi.t36.service.FactoryService;
import com.kanchi.t36.service.ShapeService;

public class AopMain {

    public static void main(String[] args){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring34.xml");
//        ShapeService shapeService= ctx.getBean("shapeService", ShapeService.class);

        FactoryService factoryService =new FactoryService();
        ShapeService shapeService = (ShapeService) factoryService.getBean("ShapeService");

        shapeService.getCircle();
    }
}
