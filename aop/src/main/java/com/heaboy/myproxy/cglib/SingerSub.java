package com.heaboy.myproxy.cglib;

/**
 * @ClassName SingerSub
 * @Description TODO
 * @Author heaboy@heaboy.com
 * @Version 1.0.0
 */
public class SingerSub extends Singer {
    @Override
    public void dance() {
        System.out.println("shouqian");
        super.dance();

    }

    @Override
    public int singing() {
        System.out.println("shouqian");
        return super.singing();
    }
}
