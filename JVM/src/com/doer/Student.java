package com.doer;
/*
    类加载器
    ClassLoader
    根加载器
    扩展类加载器
    应用程序加载器
 */
public class Student {
    @Override
    public String toString() {
        return "Hello";
    }

    public static void main(String[] args) {
        Student student = new Student();
        ClassLoader classLoader = student.getClass().getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(classLoader.getParent());//sun.misc.Launcher$ExtClassLoader@14ae5a5
        System.out.println(classLoader.getParent().getParent());//null
        System.out.println(student.toString());


        new Thread().start();
    }
}
