package com.doer.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//分析性能问题
public class Test10 {

    //普通方式调用
    public static void test01(){
        User user = new User();
        long startTime = System.nanoTime();


        for (int i = 0; i < 1000000000; i++) {
            user.getId();
        }
        long endTime = System.nanoTime();
        System.out.println("普通方式执行10亿词:"+(endTime - startTime)+"ns");
    }

    //反射方式调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getId = c1.getDeclaredMethod("getId", null);
        long startTime = System.nanoTime();


        for (int i = 0; i < 1000000000; i++) {
            getId.invoke(user,null);
        }
        long endTime = System.nanoTime();
        System.out.println("关闭检测前反射方式执行10亿词:"+(endTime - startTime)+"ns");
    }

    //反射方式调用,关闭检测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getId = c1.getDeclaredMethod("getId", null);
        long startTime = System.nanoTime();
        getId.setAccessible(true);

        for (int i = 0; i < 1000000000; i++) {
            getId.invoke(user,null);
        }
        long endTime = System.nanoTime();
        System.out.println("关闭检测后反射方式执行10亿词:"+(endTime - startTime)+"ns");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }
}
