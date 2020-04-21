package com.kanchi.t31.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {



    @After("args(v)")
    public void stringArgumentMethodWithValue(String v){
        System.out.println("After ran. A Method that takes String argument has been Called With Value : "+v);
    }

    @AfterReturning("args(v)")
    public void stringArgumentMethod(String v){
        System.out.println("after returning ran");
    }

    @AfterReturning(pointcut = "args(v)", returning = "returnString")
    public void stringArgumentMethod(String v, Object returnString){
        System.out.println("after returning ran. Name: "+ v + " Retunered :"+returnString);
    }

    @AfterThrowing("args(v)")
    public void ExceptionAdvice(String v){
        System.out.println("An exception has been thrown");
    }

    @AfterThrowing(pointcut = "args(v)", throwing = "e")
    public void ExceptionAdvice(String v, Exception e){
        System.out.println("An exception has been thrown " + e);
    }


    @Pointcut("execution( * get*())")
    public void allGetters(){}

    @Pointcut("within(com.kanchi.t31.model.Circle)")
    public void allCircleMethods(){}

}
