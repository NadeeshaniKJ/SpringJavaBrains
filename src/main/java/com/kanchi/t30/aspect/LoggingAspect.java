package com.kanchi.t30.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethods()")
    public void LoggingAdvice(JoinPoint joinPoint){
        System.out.println(joinPoint.toString());
        System.out.println(joinPoint.getTarget());
    }

    @Before("args(String)")
    public void StringArgumentMehod(){
        System.out.println("A method that takes String argument has been called");
    }

    @Before("args(v)")
    public void stringArgumentMethodWithValue(String v){
        System.out.println("A Method that takes String argument has been Called With Value : "+v);
    }


    @Pointcut("execution( * get*())")
    public void allGetters(){}

    @Pointcut("within(com.kanchi.t30.model.Circle)")
    public void allCircleMethods(){}

}
