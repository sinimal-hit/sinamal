package com.java;
/*
    方法重载机制
        1、以下程序不使用方法重载机制，分析程序的缺点。
            以下程序没有语法错误，运行也是正常的，但是代码风格上存在什么缺点？
            sumInt,sumLong,sumDouble，不是功能“相同”，而是功能“相似”；
            缺点包括两个：
                第一个：代码不美观（次要的）、
                第二的：程序员需要记更多的方法名称。
 */
public class OverloadTest01 {
    public static void main(String[] args) {
        int result1 = sumInt(11,23);
        System.out.println(result1);
        long result2 = sumLong(12343,2325);
        System.out.println(result2);
        double result3 = sumDouble(12.3,12.8);
        System.out.println(result3);
    }
    //定义一个计算int类型的求和方法，
    public static int sumInt(int a,int b){
        return a + b;
    }
    //定义一个long类型的数据的求和方法
    public static long sumLong(long a,long b){
        return a + b;
    }
    //定义一个double类型的数据的求和方法
    public static double sumDouble(double a,double b){
        return a + b;
    }
}
