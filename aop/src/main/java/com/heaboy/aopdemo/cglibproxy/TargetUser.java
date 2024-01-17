package com.heaboy.aopdemo.cglibproxy;


import java.util.ArrayList;
import java.util.List;

import static com.heaboy.aopdemo.jdkproxy.TargetUser.print;

public class TargetUser {

    public static void main(String[] args) {
        Target target = (Target) TargetProxy.getProxy(new Target());
        System.out.println(target.getClass().getName());
        target.method1();
        print(target);
    }

}
