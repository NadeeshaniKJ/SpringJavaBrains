package com.kanchi.t22;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args){
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring22.xml");
//        BeanFactory beanFactory=context;
        context.registerShutdownHook();
        Shape shape= (Shape) context.getBean("circle");
        shape.draw();
        System.out.println(context.getMessage("greeting",null,"Default message",null));
    }
}
