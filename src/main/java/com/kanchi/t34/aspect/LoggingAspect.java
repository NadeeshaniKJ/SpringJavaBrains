package com.kanchi.t34.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


public class LoggingAspect {


    public Object myAroundadvice(ProceedingJoinPoint proceedingJoinPoint){

        Object returnValue =null;

        try {
            System.out.println("Before Around34");
            proceedingJoinPoint.proceed();
            System.out.println("After Around");
        } catch (Throwable throwable) {
            System.out.println("After Throwing Around");
//            throwable.printStackTrace();
        }
        System.out.println("After Finally Around" );

        return returnValue;
    }

}
