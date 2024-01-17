package com.heaboy.aopdemo.jdkproxy;

/**
 * @author Administrator
 * @version 1.0
 * @className Target
 * @description TODO
 * @date 2021/5/24 13:34
 */
public class Target implements TargetInteface {
    @Override
    public void method1() {
        System.out.println("method1 running ...");
    }

    @Override
    public void method2() {
        System.out.println("method2 running ...");
    }

    @Override
    public int method3(Integer i) {
        System.out.println("method3 running ...");
        return i;
    }
}
