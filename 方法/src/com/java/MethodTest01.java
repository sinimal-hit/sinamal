package com.java;
/*
    1、JVM中的主要内存：栈内存，堆内存，方法区内存
        ① 方法区是最先有数据：方法区中存放的是代码片段，存放class字节码
        ② 堆内存：后面讲解
        ③栈内存：方法调用的时候，该方法需要的空间在栈内存分配；
            方法不调用的时候不会再栈中分配空间的
            方法只有在调用的时候才会分配空间，并且调用的时候就是压栈
            方法执行结束之后，该方法所需要的空间就会释放，此时发生弹栈动作
          方法调用叫做：压栈。分配空间；
          方法结束叫做：弹栈。释放空间；
        栈中存储什么？
            方法运行的过程中需要的内存，以及栈中会存储方法的局部变量。

 */
public class MethodTest01 {
    public static void main(String[] args) {
        System.out.println("main begin");
        fun1();
        System.out.println("main over");
    }

    public static void fun1() {
        System.out.println("fun1 begin");
        fun2();
        System.out.println("fun1 over");
    }

    public static void fun2() {
        System.out.println("fun2 begin");
        System.out.println("fun2方法正在执行");
        System.out.println("fun2 over");
    }
}
