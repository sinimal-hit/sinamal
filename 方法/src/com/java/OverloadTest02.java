package com.java;
/*
    使用方法重载机制解决之前的矛盾
        优点1：代码整齐美观。
        优点2：功能相似的，可以让方法名相同，更容易以后的代码编写
 */
public class OverloadTest02 {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(1253253,315321));
        System.out.println(sum(19.4,12.23));
    }

    public static int sum(int m, int n) {
        return m + n;
    }
    public static int sum(int m, int n,int l) {
        return m + n +l;
    }
    public static long sum(long m, long n) {
        return m + n;
    }
    public static double sum(double m, double n) {
        return m + n;
    }
}
