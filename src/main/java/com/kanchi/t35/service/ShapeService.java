package com.kanchi.t35.service;

import com.kanchi.t35.aspect.Loggable;
import com.kanchi.t35.model.Circle;
import com.kanchi.t35.model.Triangle;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    @Loggable
    public Circle getCircle() {
        System.out.println("Circle getter");
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}
