package com.heaboy.controller;


import com.heaboy.aopdemo.annotationaop.TestAnnotation;
import org.springframework.aop.framework.AopContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/test.do")
    @ResponseBody
    public String testController() {
        TestController o = (TestController) AopContext.currentProxy();
        o.test();
//        System.out.println("tewt");
        return "ok";
    }

    @TestAnnotation
    public void test() {
        System.out.println("test running");
    }

}
