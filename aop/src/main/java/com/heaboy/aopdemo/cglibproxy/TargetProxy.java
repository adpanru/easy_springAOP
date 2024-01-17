package com.heaboy.aopdemo.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

public class TargetProxy {

    public static <T> Object getProxy(T t) {
        Enhancer en = new Enhancer(); //帮我们生成代理对象
        en.setSuperclass(t.getClass());//设置要代理的目标类
        en.setCallback(new MethodInterceptor() {
            //代理要做什么
            @Override
            public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("执行方法前。。。");
                //调用原有方法
                Object invoke = methodProxy.invokeSuper(object, args);
                // Object invoke = method.invoke(t, args);// 作用等同与上面。
                System.out.println("执行方法后。。。");
                return invoke;
            }
        });
        return en.create();
    }
}