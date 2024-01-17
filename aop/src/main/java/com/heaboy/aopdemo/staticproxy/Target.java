package com.heaboy.aopdemo.staticproxy;

import com.heaboy.aopdemo.jdkproxy.TargetInteface;

public class Target implements TargetInteface {
    @Override
    public void method1() {
        System.out.println(" Target method1 running ...");
    }

    @Override
    public void method2() {
        System.out.println("Target method2 running ...");
    }

    @Override
    public int method3(Integer i) {
        System.out.println("Target  method3 running ...");
        return i;
    }
}
