package com.heaboy.myproxy.static1;

/**
 * @ClassName Cai
 * @Description TODO
 * @Author heaboy@heaboy.com
 * @Version 1.0.0
 */
public class Cai implements Singer {
    @Override
    public void singing() {
        System.out.println("cai 唱歌");
    }

    @Override
    public int dance() {
        System.out.println("tiaowu");
        return 0;
    }
}
