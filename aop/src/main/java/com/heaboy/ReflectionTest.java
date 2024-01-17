package com.heaboy;

import com.heaboy.aopdemo.cglibproxy.Target;
import com.heaboy.aopdemo.cglibproxy.TargetProxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: ���ں�
 * \* Date: 2022/3/10
 * \* Time: 20:15
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ReflectionTest {
    public static void main(String[] args) {
        Target target = (Target) TargetProxy.getProxy(new Target());
        String name="com.heaboy.aopdemo.cglibproxy.Target$$EnhancerByCGLIB$$f9f41fb8";
        ArrayList list =new ArrayList<>(200);
        list.add("ss");
        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.print("class "+name);
            if(supercl!=null&& supercl!=Object.class)System.out.print("extends "+supercl.getName());
            System.out.print("{\n");
            priConstrutors(cl);
            System.out.println();
            priMethods(cl);
            System.out.println();
            priFields(cl);
            System.out.println("}");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    private static void priConstrutors(Class cl) {
        Constructor[] constructors = cl.getConstructors();
        for (Constructor c : constructors){
            String name = c.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.print(name+"(");
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if(j>0) System.out.print(",");
                System.out.print(paramTypes[j].getName());

            }
            System.out.println(");");
        }

    }
    private static void priMethods(Class cl){
        Method[] methods=cl.getDeclaredMethods();
        for (Method m:methods
             ) {
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.println("  ");
            String modifiders = Modifier.toString(m.getModifiers());
            if(modifiders.length()>0) System.out.print(modifiders+" ");
            System.out.print(retType.getName()+" "+name+"(");
            Class[] paramtypes=m.getParameterTypes();
            for (int j = 0; j < paramtypes.length; j++) {
                if(j>0) System.out.print(",");
                System.out.print(paramtypes[j].getName());

            }
            System.out.println(");");
        }
    }
    public  static  void priFields(Class cl){
        Field[] fields = cl.getDeclaredFields();
        for (Field f:fields
             ) {
            Class type = f.getType();
            String name = f.getName();
            System.out.println(" ");
            String mod = Modifier.toString(f.getModifiers());
            if(mod.length()>0) System.out.print(mod+" ");
            System.out.println(type.getName()+" "+name+";");

        }
    }


}

