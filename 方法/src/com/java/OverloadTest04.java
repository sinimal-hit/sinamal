package com.java;
/*
    证明方法重载和方法的返回值类型无关
 */
public class OverloadTest04 {
    public static void main(String[] args) {
        sum(12,4);
        int result = sum(12,4);
        System.out.println(result);
    }

    //这种情况是方法的重复，并没有发生方法的重载
    public static int sum(int m, int n) {
        return m + n;
    }
//    public static double sum(int m, int n) {
//        return m + n;
//    }
}
