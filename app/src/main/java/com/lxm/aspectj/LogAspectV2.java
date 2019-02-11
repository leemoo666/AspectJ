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
public class LogAspectV2 {

    @Pointcut("execution(* com.lxm.aspectj..onClick(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before(JoinPoint point) {
        Log.i("lxm","@Before LogAspectV2");
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.i("lxm","@Around LogAspectV2");
        joinPoint.proceed();
    }

    @After("pointcut()")
    public void after(JoinPoint point) {
        Log.i("lxm","@After LogAspectV2");
    }

    @AfterReturning("pointcut()")
    public void afterReturning(JoinPoint point, Object returnValue) {
        Log.i("lxm","@AfterReturning LogAspectV2");
    }

    @AfterThrowing(value = "pointcut()", throwing = "ex")
    public void afterThrowing(Throwable ex) {
        Log.i("lxm","@afterThrowing LogAspectV2..."+ex.getMessage());
    }
}
