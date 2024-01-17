package com.heaboy.aopdemo.confaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("spring-confaop.xml");
        Target targetProxy = (Target) appCtx.getBean("target");
        System.out.println(targetProxy.method3(0));
    }
}
