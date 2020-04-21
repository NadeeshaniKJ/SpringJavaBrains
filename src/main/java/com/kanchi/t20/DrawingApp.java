package com.kanchi.t20;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args){
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring20.xml");
//        BeanFactory beanFactory=context;
        context.registerShutdownHook();
        Shape shape= (Shape) context.getBean("circle");
        shape.draw();

    }
}
