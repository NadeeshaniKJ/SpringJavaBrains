package com.kanchi.t32.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {


    @Around("allGetters()")
    public Object myAroundadvice(ProceedingJoinPoint proceedingJoinPoint){

        Object returnValue =null;

        try {
            System.out.println("Before Around");
//            proceedingJoinPoint.proceed();
            returnValue=proceedingJoinPoint.proceed();
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

    @Pointcut("within(com.kanchi.t32.model.Circle)")
    public void allCircleMethods(){}

}
