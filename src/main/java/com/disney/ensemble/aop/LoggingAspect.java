package com.disney.ensemble.aop;

/**
 * Created by Nadav on 29/11/2017.
 */


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class LoggingAspect {


    @Around("@annotation(com.disney.ensemble.aop.Loggable)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;

        System.out.println("###########################");
        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        System.out.println("############################");
        return proceed;
    }

}