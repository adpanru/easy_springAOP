package com.heaboy.aopdemo.annotationaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/*
* 切面类
**/
@Aspect
@Component
public class AnnotationAspect {

    // 定义一个切点：所有被RequestMapping注解修饰的方法会织入advice
    @Pointcut("@annotation(TestAnnotation)")
    private void advicePointcut() {}

    /*
    * 前置通知
    **/
    @Before("advicePointcut()")
    public void before() {
        System.out.println("annotation前置通知");
    }

    @After("advicePointcut()")
    public void after() {
        System.out.println("annotation后置通知");
    }

    @AfterReturning(pointcut = "advicePointcut()")
    public void afterReturning() {
        System.out.println("annotation后置返回通知");
    }

    @AfterThrowing(pointcut = "advicePointcut()", throwing = "ex")
    public void afterThrowing(Exception ex) throws Exception {
        System.out.println("annotation异常通知");
        System.out.println(ex.getMessage());
    }

    @Around("advicePointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object proceed = null;
        if (!"".equals("admin")) {
            System.out.println("annotation环绕前置");
            proceed = pjp.proceed(pjp.getArgs());
            System.out.println("annotation环绕后置");
        }
        return proceed;
    }
}
