package com.doer.tvolatile;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo04 {
    private volatile static AtomicInteger num = new AtomicInteger(0);
    public static void main(String[] args) {
        //理论上num结果为20000
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    add();
                }
            }).start();
        }
        while (Thread.activeCount() > 2){
            Thread.yield();
        }
        //打印的值总是趋近于是20000
        System.out.println(Thread.currentThread().getName()+" "+num);
    }
    public  static void  add(){
        num.getAndIncrement();
    }
}
