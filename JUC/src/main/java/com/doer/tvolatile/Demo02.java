package com.doer.tvolatile;

import java.util.concurrent.TimeUnit;

/**
 * 证明volatile的可见性
 * Demo01中已经发现  main线程修改num 的值之后,t1线程并没有发现主内存中num的值被修改了会继续执行while循环里的任务
 *
 * 为了解决这一个问题需要volatile关键字的引用
 *  当num的值被main线程修改之后同步到主内存当中,t1线程可以直接看到num的值被修改了,
 */
public class Demo02 {
    //不加volatile 程序就会死循环
    private static volatile int num = 0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while (num == 0){
                //只要num是0 一直让该线程执行任务
            }
        },"t1").start();


        TimeUnit.SECONDS.sleep(2);

        //t1线程启动之后,main线程睡眠两秒将num的值修改未1
        num=1;
        System.out.println(num  );

    }
}
