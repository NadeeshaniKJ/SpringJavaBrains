package com.kanchi.t46.main;

import com.kanchi.t46.dao.HibernateDaoImpl;
import com.kanchi.t46.dao.JdbcDaoImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring46.xml");
//        applicationContext.registerShutdownHook();
//        BeanFactory beanFactory=applicationContext;

        HibernateDaoImpl hibernateDao= applicationContext.getBean("hibernateDaoImpl", HibernateDaoImpl.class);

        System.out.println(hibernateDao.getCircleCount());

    }
}

