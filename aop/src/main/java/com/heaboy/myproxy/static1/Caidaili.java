package com.heaboy.myproxy.static1;

/**
 * @ClassName Caidaili
 * @Description TODO
 * @Author heaboy@heaboy.com
 * @Version 1.0.0
 */
public class Caidaili implements  Singer{
    private Singer cai = new Cai();
    @Override
    public void singing() {
        System.out.println("先收钱");
        cai.singing();
    }

    @Override
    public int dance() {
        System.out.println("先收钱");
        cai.dance();
        return 0;
    }
}
