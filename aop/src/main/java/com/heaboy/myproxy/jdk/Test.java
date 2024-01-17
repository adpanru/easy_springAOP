package com.heaboy.myproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName Test
 * @Description TODO
 * @Author heaboy@heaboy.com
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Cai cai =new Cai();
        Ruler ruler = new Ruler(cai);
        //构建了 以原被代理类为基准的代理类的一个对象
        // o 已经等同于 Student s = new Student(); 这个s了
        Object o = Proxy.newProxyInstance(Cai.class.getClassLoader(), new  Class[]{Singer.class}, ruler);
        System.err.println(o.getClass().toString());
        for (Class<?> anInterface : o.getClass().getInterfaces()) {
            System.err.println(anInterface.getName());
        }
        /*System.err.println(o.getClass().getInterfaces());*/
        if(o instanceof Singer){
            Singer singer =  (Singer)o;
            singer.dance();
            singer.singing();
            singer.toString();
        }
    }
}
class Ruler implements InvocationHandler{
    private Singer s;

    public Ruler(Singer s) {
        this.s = s;
    }

    @Override
    public Object invoke(Object p, Method method, Object[] args) throws Throwable {
//        System.out.println(p.getClass().toString());
        System.out.println("先收钱");
        Object returnVal = method.invoke(s, args);
        System.out.println("asdfasdf");
        return returnVal;
    }
}