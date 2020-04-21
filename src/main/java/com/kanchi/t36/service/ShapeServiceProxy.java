package com.kanchi.t36.service;

import com.kanchi.t36.aspect.LoggingAspect;
import com.kanchi.t36.model.Circle;

public class ShapeServiceProxy extends ShapeService {

    public Circle getCircle(){
        new LoggingAspect().loggingAdvice();
        return super.getCircle();
    }
}
