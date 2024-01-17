package com.heaboy.aopdemo.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.heaboy.aopdemo.jdkproxy.TargetUser.print;

/**
 * 测试
 */
public class AopTest {
    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("spring-aop.xml");
        TargetInteface targetProxy = (TargetInteface) appCtx.getBean("targetProxy");
        targetProxy.method1();
        print(targetProxy);
    }
}
