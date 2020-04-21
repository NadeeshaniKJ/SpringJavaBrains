package com.kanchi.t23;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args){
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring23.xml");
//        BeanFactory beanFactory=context;
        context.registerShutdownHook();
        Shape shape= (Shape) context.getBean("circle");
        shape.draw();
//        System.out.println(context.getMessageSource("greeting",null,"Default message",null));
    }
}
