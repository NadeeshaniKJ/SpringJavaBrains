package com.kanchi.t21;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args){
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring21.xml");
//        BeanFactory beanFactory=context;
        context.registerShutdownHook();
        Shape shape= (Shape) context.getBean("circle");
        shape.draw();
    }
}
