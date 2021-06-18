package com.doer.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 获得类的信息
 */
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 =  Class.forName("com.doer.reflection.User");

        //获得类的名字
        System.out.println(c1.getName()); //获得包名和类名  com.doer.reflection.User
        System.out.println(c1.getSimpleName());//获得类名  User

        //获得类的属性
        System.out.println("===========================");

        /*
        注意: c1.getFields() 方法只能找到public修饰类的属性,所以这里是找不到User类的属性的
         */
        Field[] fields = c1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        /*
        c1.getDeclaredFields()找到类全部的属性
        输出:
            private int com.doer.reflection.User.id
            private int com.doer.reflection.User.age
         */
        fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("============================");

        //获得指定属性的值
        Field name = c1.getDeclaredField("id");
        System.out.println(name);
        System.out.println("========================");


        //获得类的方法
        Method[] methods = c1.getMethods(); //获得本类的及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的"+method);
        }
        System.out.println();
        methods = c1.getDeclaredMethods();//获得本类的所有方法
        for (Method method : methods) {
            System.out.println(method);
            System.out.println("getDeclaredMethods"+method);

        }
        System.out.println();
        System.out.println("======= 以下是获得执行的方法代码运行结果==========");
        //获得执行的方法
        Method getAge = c1.getMethod("getAge",null);
        Method setAge = c1.getMethod("setAge", int.class);
        System.out.println(getAge);
        System.out.println(setAge);
        System.out.println();
        System.out.println("==========以下是获得指定的构造器============");

        //获得指定的构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println();
        constructors = c1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println();

        //获得指定的构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(int.class,int.class);
        System.out.println(declaredConstructor);
    }
}
