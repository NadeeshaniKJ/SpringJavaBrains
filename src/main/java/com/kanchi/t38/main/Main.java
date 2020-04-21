package com.kanchi.t38.main;

import com.kanchi.t38.dao.JdbcDaoImpl;
import com.kanchi.t38.model.Circle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring38.xml");
        applicationContext.registerShutdownHook();
        BeanFactory beanFactory=applicationContext;

        JdbcDaoImpl jdbcDao= beanFactory.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

        Circle circle=jdbcDao.getCircle(1);
        System.out.println(circle.getName());

    }
}

