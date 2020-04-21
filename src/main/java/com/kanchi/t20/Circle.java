package com.kanchi.t20;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {
    private Point centre;

    public Point getCentre() {
        return centre;
    }

//    @Autowired
//    @Qualifier("circleRelated")
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
