package com.doer.tvolatile;

import java.util.concurrent.TimeUnit;

//验证可见性
/**
 *
 * t1线程启动之后,main线程睡眠两秒将num的值修改为1
 * 会出现一个问题,main线程已经将num的值修改为1了 ,但是对于t1线程来说,
 * 并不知道主内存num的值已经被修改过了,对主内存的变化是不知道的
 */
public class Demo01 {
    private static int num = 0;
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
