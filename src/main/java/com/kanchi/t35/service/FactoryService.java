package com.kanchi.t35.service;

import com.kanchi.t35.model.Circle;
import com.kanchi.t35.model.Triangle;

public class FactoryService {

    public Object getBean(String beanType){
        if(beanType.equals("ShapeService")) return new ShapeService();
        if(beanType.equals("Circle")) return new Circle();
        if(beanType.equals("Triangle")) return new Triangle();
        return null;
    }
}
