package com.doer.poll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Executors 工具类
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        //ExecutorService threadPool = Executors.newSingleThreadScheduledExecutor();//单个线程
        //ExecutorService threadPool = Executors.newFixedThreadPool(5);//创建一个固定的线程池的大小
        ExecutorService threadPool = Executors.newCachedThreadPool();//可伸缩的线程池,遇强则强,遇弱则弱

        try {
            for (int i = 0; i < 10; i++) {
                //使用了线程池之后,需要使用线程池创建线程

                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"  OK");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //线程池用完,程序结束,需要关闭线程池
            threadPool.shutdown();
        }


    }
}
