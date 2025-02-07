package com.teja.aspect_oriented_programming.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.teja.aspect_oriented_programming.service..*(..))")
    public void employeeService(){
        log.info("Before method invoked !!");
    }

    @AfterReturning("execution(* com.teja.aspect_oriented_programming.service..*(..))")
    public void returnfromservice(){
        log.info("After method executed !!");
    }

    @AfterThrowing("execution(* com.teja.aspect_oriented_programming.service..*())")
    public void errorFromService(){
        log.info("After throwing error from method");
    }

    @Around("execution(* com.teja.aspect_oriented_programming.service..*(..))")
    public Object aroundmethodexecution(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("Before method started :");
        Object object = proceedingJoinPoint.proceed();
        log.info("After method ended :");
        return object;
    }

    @Before("within(com.teja.aspect_oriented_programming.service.*)")
    public void packageOrClass(){
        log.info("Entering a service");
    }

    @Before("@within(org.springframework.stereotype.Service)")
    public void classContainsAnnotaion(){
        log.info("Contains a service annotation");
    }

    @Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void methodContainingAnnotation(){
        log.info("Method contains GetMapping annotation");
    }
}
