package com.java;
/*
    递归：方法调用自己
        1、当递归程序没有结束条件时，一定会发生：栈内存溢出
            所以递归必须有结束条件
        2、如果递归设置结束条件，就一定不会发生栈溢出错误吗？
            假设这个结束条件是对的，递归的时候也有可能发生栈内存错误，
            因为有可能递归的太深了，栈内存一直压栈，栈内存不够用，也会引起栈内存不够使用。
        3、递归消耗的内存比较大，另外如果递归的使用不当，会导致JVM死掉
            JVM发生错误之后只有一个结果，就是JVM退出。

 */
public class RecursiveTest01 {
    public static void main(String[] args) {
        doSome();
    }

    private static void doSome() {
        System.out.println("doSome begin");
        doSome();//Exception in thread "main" java.lang.StackOverflowError
        //出现栈内存溢出错误，
        System.out.println("soSome over");
    }
}
