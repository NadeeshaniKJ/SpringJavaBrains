package com.kanchi.t33.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {


    @Around("@annotation(com.kanchi.t33.aspect.Loggable)")
    public Object myAroundadvice(ProceedingJoinPoint proceedingJoinPoint){

        Object returnValue =null;

        try {
            System.out.println("Before Around33");
            proceedingJoinPoint.proceed();
            System.out.println("After Around");
        } catch (Throwable throwable) {
            System.out.println("After Throwing Around");
//            throwable.printStackTrace();
        }
        System.out.println("After Finally Around" );

        return returnValue;
    }


    @Pointcut("execution( * get*())")
    public void allGetters(){}

    @Pointcut("within(com.kanchi.t33.model.Circle)")
    public void allCircleMethods(){}

}
