package com.heaboy.aopdemo.staticproxy;

public class TargetUser {

    public static void main(String[] args) {
        TargetInteface target = new TargetProxy();
        target.method1();
        System.out.println("-----------------------------");
        target.method2();
        System.out.println("-----------------------------");
        System.out.println(target.method3(3));
    }
}
