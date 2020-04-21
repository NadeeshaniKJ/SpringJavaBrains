package com.kanchi.t21;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Controller
public class Circle implements Shape {
    private Point centre;

    public Point getCentre() {
        return centre;
    }

    @Resource(name = "pointA")
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println(" Circle Centre is (" + centre.getX() + "," + centre.getY() + ")");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("start ");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("end");
    }

}
