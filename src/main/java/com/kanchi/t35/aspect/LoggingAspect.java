package com.kanchi.t35.aspect;

import org.aspectj.lang.ProceedingJoinPoint;


public class LoggingAspect {


    public Object myAroundadvice(ProceedingJoinPoint proceedingJoinPoint){

        Object returnValue =null;

        try {
            System.out.println("Before Around35");
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
