package com.heaboy.aopdemo.aop;


/**
 * 目标类
 */
public class Target implements TargetInteface{

    /*
    * 需要增强的方法，连接点JoinPoint
    **/
    public void method1() {
        System.out.println("method1 running ...");
    }

    public void method2() {
        System.out.println("method2 running ...");
    }

    public int method3(Integer i) {
        System.out.println("method3 running ...");
        return i;
    }
}
