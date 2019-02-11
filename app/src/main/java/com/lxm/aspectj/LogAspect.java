package com.lxm.aspectj;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {

    @Pointcut("execution(@com.lxm.aspectj.AnnotationLog * *(..))")
    public void logAspect() {

    }

    @Before("logAspect()")
    public void before(JoinPoint point) {
        Log.i("lxm","@Before LogAspect");
    }

    @Around("logAspect()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.i("lxm","@Around LogAspect");
        joinPoint.proceed();
    }

    @After("logAspect()")
    public void after(JoinPoint point) {
        Log.i("lxm","@After LogAspect");
    }

    @AfterReturning("logAspect()")
    public void afterReturning(JoinPoint point, Object returnValue) {
        Log.i("lxm","@AfterReturning LogAspect");
    }

    @AfterThrowing(value = "logAspect()", throwing = "ex")
    public void afterThrowing(Throwable ex) {
        Log.i("lxm","@afterThrowing LogAspect..."+ex.getMessage());
    }
}
