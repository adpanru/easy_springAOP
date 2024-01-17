package com.heaboy.aopdemo.staticproxy;


public class TargetProxy implements TargetInteface {

    private Target target =new Target();
    @Override
    public void method1() {
        System.out.println("执行方法前...");
        target.method1();
        System.out.println("执行方法后...");
    }

    @Override
    public void method2() {
        System.out.println("执行方法前...");
        target.method2();
        System.out.println("执行方法后...");
    }

    @Override
    public int method3(Integer i) {
        System.out.println("执行方法前...");
        int method3 = target.method3(i);
        System.out.println("执行方法后...");
        return method3;
    }
}
