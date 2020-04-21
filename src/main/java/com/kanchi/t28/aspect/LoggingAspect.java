package com.kanchi.t28.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allGetters()")
    public void LoggingAdvice(){
        System.out.println("Advice run, Get Method Called");
    }

    @Before("allGetters()")
    public void secondAdvice(){
        System.out.println("Second Advice run, Get Method Called");
    }

    @Pointcut("execution( * get*())")
    public void allGetters(){}



}
