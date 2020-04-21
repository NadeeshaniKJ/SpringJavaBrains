package com.kanchi.t44.main;

import com.kanchi.t44.dao.JdbcDaoImpl;
import com.kanchi.t44.model.Circle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring44.xml");
        applicationContext.registerShutdownHook();
        BeanFactory beanFactory=applicationContext;

        JdbcDaoImpl jdbcDao= beanFactory.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

//        Circle circle=jdbcDao.getCircle(1);
//        System.out.println(circle.getName());

//        System.out.println(jdbcDao.getCircleCount());
//        System.out.println(jdbcDao.getCircleName(1));
//
//        Circle circle=jdbcDao.getCircleforId(1);
//        System.out.println(circle.getName());

        jdbcDao.insertCircle(new Circle(5,"Fourth Circle"));
        System.out.println(jdbcDao.getAllCircles().size());

//        jdbcDao.createTriangleTable();


    }
}

