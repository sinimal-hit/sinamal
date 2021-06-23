package com.doer.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * CAS 比较并交换
 */
public class CASDemo {
    private AtomicInteger atomicInteger = new AtomicInteger();
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();

        //public final boolean compareAndSet(int expect, int update)
        //参数是期望,更新,如果我的期望值达到了就更新,否则就不更新
        //依然是0,因为初始值是0,期望值并没有达到,不会更新
        atomicInteger.compareAndSet(200,2);
        System.out.println(atomicInteger.get());

        atomicInteger.compareAndSet(0,2);
        System.out.println(atomicInteger.get());//2
    }
}
