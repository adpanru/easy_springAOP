package com.heaboy.aopdemo.confaop;

/*
* 目标类
**/
public class Target {

    public void method1() {
        System.out.println("method1 running ...");
    }

    public void method2() {
        System.out.println("method2 running ...");
    }

    /*
    * 连接点JoinPoint
    **/
    public int method3(Integer i) {
        System.out.println("method3 running ...");
        int i1 = 1 / i;
        return i;
    }
}
