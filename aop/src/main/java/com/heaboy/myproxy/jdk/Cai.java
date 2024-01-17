package com.heaboy.myproxy.jdk;

/**
 * @ClassName Cai
 * @Description TODO
 * @Author heaboy@heaboy.com
 * @Version 1.0.0
 */
public class Cai implements Singer {
    @Override
    public void dance() {
        System.out.println("Cai 在跳舞");
    }

    @Override
    public int singing() {
        System.out.println("Cai 在唱歌");
        return 0;
    }
}
