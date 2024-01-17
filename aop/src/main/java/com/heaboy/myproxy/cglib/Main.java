package com.heaboy.myproxy.cglib;

/**
 * @ClassName Main 静态代理的一种实现方式
 * @Description TODO
 * @Author heaboy@heaboy.com
 * @Version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        Singer singer = new SingerSub();
        singer.singing();
        singer.dance();
    }
}
