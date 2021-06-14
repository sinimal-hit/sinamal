package com.doer;

public class NativeTest {
    public static void main(String[] args) {
        new Thread(()->{

        },"myThread").start();
    }

    //native: 凡是带了native关键字的.说明java作用范围达不到le,会去底层调用C语言的库!!
    /*
        凡是调用含有native该关键字的方法,会进入本地方法栈,
        就会调用本地方法本地方法接口: JNI
            本地方法接口(JNI)的作用:
              就是为了调用本地方法库,扩展java的使用,融合不同的编程语言为java所用!! 最初是C,C++
              java诞生的时候,C,C++横行,想要立足,必须要有调用c,c++的程序~~
              它在内存区域中专门开辟了一块标记区域:本地方法栈 Native Method Stack,登记Native方法
              在最终执行的时候,加载本地方法库中的方法通过JNI
     */
    private native void start0();


}
