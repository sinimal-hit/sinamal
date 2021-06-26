package com.doer.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CASDemo02 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2000);

        //捣乱的线程
        //捣乱的线程把期望值改为2001,再将2001更改为原本的期望值2000,
        atomicInteger.compareAndSet(2000,2001);
        System.out.println(atomicInteger.get());

        atomicInteger.compareAndSet(2001,2000);
        System.out.println(atomicInteger.get());


        //期望的线程,并不知道期望值有没有发生变化,就会产生ABA问题
        atomicInteger.compareAndSet(2000,6666);
        System.out.println(atomicInteger.get());//2
    }
}
