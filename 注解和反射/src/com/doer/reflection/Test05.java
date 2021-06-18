package com.doer.reflection;

/**
 * 类的加载
 */
public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
        /*
        1.加载到内存,会产生一个类对应的CLass对象
        2.链接,

         */
    }
}
class  A{
    static {
        System.out.println("A类静态代码块初始画");
        m = 300;
    }
    static int m = 100;
    public A(){
        System.out.println("A类的无参构造初始化");
    }

}
