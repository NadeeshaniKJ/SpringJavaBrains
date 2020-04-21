package com.kanchi.t42.main;

import com.kanchi.t42.dao.JdbcDaoImpl;
import com.kanchi.t42.model.Circle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring42.xml");
        applicationContext.registerShutdownHook();
        BeanFactory beanFactory=applicationContext;

        JdbcDaoImpl jdbcDao= beanFactory.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

//        Circle circle=jdbcDao.getCircle(1);
//        System.out.println(circle.getName());

        System.out.println(jdbcDao.getCircleCount());
        System.out.println(jdbcDao.getCircleName(1));

        Circle circle=jdbcDao.getCircleforId(1);
        System.out.println(circle.getName());

        System.out.println(jdbcDao.getAllCircles().size());

    }
}

