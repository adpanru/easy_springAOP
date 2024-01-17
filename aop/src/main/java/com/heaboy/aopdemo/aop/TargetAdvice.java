package com.heaboy.aopdemo.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class TargetAdvice implements MethodInterceptor, MethodBeforeAdvice, AfterReturningAdvice {

    /*
    * 通知/增强
    **/
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("前置环绕通知");
        Object proceed = methodInvocation.proceed();
        System.out.println("后置环绕通知");
        return proceed;
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("后置返回通知");
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("前置通知");
    }
}
