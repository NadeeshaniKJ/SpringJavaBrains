package com.kanchi.t33.service;

import com.kanchi.t33.aspect.Loggable;
import com.kanchi.t33.model.Circle;
import com.kanchi.t33.model.Triangle;

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
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}
