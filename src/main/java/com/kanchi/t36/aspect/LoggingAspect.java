package com.kanchi.t36.aspect;

import org.aspectj.lang.ProceedingJoinPoint;


public class LoggingAspect {


    public Object myAroundadvice(ProceedingJoinPoint proceedingJoinPoint){

        Object returnValue =null;

        try {
            System.out.println("Before Around36");
            proceedingJoinPoint.proceed();
            System.out.println("After Around");
        } catch (Throwable throwable) {
            System.out.println("After Throwing Around");
//            throwable.printStackTrace();
        }
        System.out.println("After Finally Around" );

        return returnValue;
    }

    public void loggingAdvice(){
        System.out.println("logging from the advice");
    }

}
