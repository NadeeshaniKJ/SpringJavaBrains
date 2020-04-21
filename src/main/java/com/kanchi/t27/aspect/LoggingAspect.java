package com.kanchi.t27.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("execution( * get*())")  //* get*(..)) >> .. means any number of arguments,  * means one or more arguments
    public void LoggingAdvice(){
        System.out.println("Advice run, Get Method Called");
    }


}
