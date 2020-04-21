package com.kanchi.t39.main;

import com.kanchi.t39.dao.JdbcDaoImpl;
import com.kanchi.t39.model.Circle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring39.xml");
        applicationContext.registerShutdownHook();
        BeanFactory beanFactory=applicationContext;

        JdbcDaoImpl jdbcDao= beanFactory.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

        Circle circle=jdbcDao.getCircle(1);
        System.out.println(circle.getName());

    }
}

