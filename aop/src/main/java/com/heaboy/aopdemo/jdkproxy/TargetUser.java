package com.heaboy.aopdemo.jdkproxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TargetUser {

    public static void main(String[] args) {
        TargetInteface target = (TargetInteface) TargetProxy.getTarget(new Target());
        target.method1();
        System.out.println("-----------------------------");
        target.method2();
        System.out.println("-----------------------------");
        System.out.println(target.method3(3));
        print(target);



    }

public  static void  print( Object target){
    Class aClass = target.getClass();
    Class cl = target.getClass();
    Class supercl = cl.getSuperclass();
    String modifiers = Modifier.toString(cl.getModifiers());
    if (modifiers.length() > 0)
        System.out.print(modifiers + " ");
    System.out.print("class:" + cl.getName());
    if (supercl != null && supercl != Object.class)
        System.out.print("extends:" + supercl.getName());
    System.out.print("\n{\n");
    printConstructors(cl);
    System.out.println();
    printMethods(cl);
    System.out.println();
    printFields(cl);
    System.out.println("}");
    System.exit(0);
}
    public static void printConstructors(Class cl) {
        Constructor[] consturctors = cl.getDeclaredConstructors();
        for (Constructor c : consturctors) {
            String name = c.getName();
            System.out.println(" ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.print(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0)
                    System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            Class reType = m.getReturnType();
            String name = m.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.print(reType.getName() + " " + name + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0)
                    System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }

}



