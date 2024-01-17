package com.heaboy.aopdemo.confaop;

import org.aspectj.lang.ProceedingJoinPoint;
/*
* 切面类
**/
public class TargetAspect {

    /*
    * 前置通知
    **/
    public void before() {
        System.out.println("conf前置通知");
    }

    public void after() {
        System.out.println("conf后置通知");
    }

    public void afterReturning() {
        System.out.println("conf后置返回通知");
    }

    public void afterThrowing(Exception ex) throws Exception {
//        System.out.println("conf异常通知");
//        System.out.println(ex.getMessage());
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object proceed = null;
        if (!"".equals("admin")) {
            System.out.println("conf环绕前置");
            proceed = pjp.proceed(pjp.getArgs());
            System.out.println("conf环绕后置");
        }
        return proceed;
    }
}
