package com.java;
/*
   方法重载：
    什么时候需要考虑方法重载？
        在同一个类中，如果“功能1”和“功能2”相似，那么可以考虑将他们的方法名一致，这样代码就更加美观
        ，又便于后期的代码编写（容易记忆，方便使用）
    什么时候代码会发生重载？
        条件1：在同一个类当中
        条件2：方法名相同
        条件3：参数列表不同
                参数列表不同又分为
                    参数个数不同，
                    参数的类型不同
                    还有就是参数的顺序不同，
    方法的重载和返回值类型无关；
    方法的重载和修饰符列表无关
 */
public class OverloadTest03 {
    public static void main(String[] args) {
        System.out.println(sum(1.2,4));
        System.out.println(sum(4,1.2));

    }

    public static double sum(double m, int n) {
        return m + n;
    }
    public static double sum(int m, double n) {
        return m + n;
    }

}
