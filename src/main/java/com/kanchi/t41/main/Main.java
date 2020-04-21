package com.kanchi.t41.main;

import com.kanchi.t41.dao.JdbcDaoImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring41.xml");
        applicationContext.registerShutdownHook();
        BeanFactory beanFactory=applicationContext;

        JdbcDaoImpl jdbcDao= beanFactory.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

//        Circle circle=jdbcDao.getCircle(1);
//        System.out.println(circle.getName());

        System.out.println(jdbcDao.getCircleCount());
        System.out.println(jdbcDao.getCircleName(1));

    }
}

