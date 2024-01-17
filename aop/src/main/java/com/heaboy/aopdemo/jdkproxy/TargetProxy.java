package com.heaboy.aopdemo.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TargetProxy {
    public static  <T> Object getTarget(T t) {
        //新构建了一个 新的 代理类的对象
        return Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // proxy就是目标对象t，method就是调用目标对象中方法，args就是调用目标对象中方法的参数。
                        //比如说：代理对象.method1(),这时proxy就是目标类，method1就是method,args就是method1方法参数。
                        System.out.println("执行方法前...");
                        Object invoke = method.invoke(t, args);
                        System.out.println("执行方法后...");
                        return invoke;
            }
        });
    }
}
