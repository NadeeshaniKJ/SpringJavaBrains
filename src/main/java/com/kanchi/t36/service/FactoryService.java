package com.kanchi.t36.service;

import com.kanchi.t36.model.Circle;
import com.kanchi.t36.model.Triangle;

public class FactoryService {

    public Object getBean(String beanType){
        if(beanType.equals("ShapeService")) return new ShapeServiceProxy();
        if(beanType.equals("Circle")) return new Circle();
        if(beanType.equals("Triangle")) return new Triangle();
        return null;
    }
}
