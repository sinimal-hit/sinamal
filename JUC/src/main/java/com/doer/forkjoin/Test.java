package com.doer.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //test01();//312
        test02();
    }

    //普通程序员
    public static void test01(){
        long start  = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0; i <= 10_0000_0000 ; i++) {
            sum+=1;
        }
        long end = System.currentTimeMillis();
        System.out.println("sum="+sum+"时间"+(end - start));
    }

    //使用forkJoin
    public static void test02() throws ExecutionException, InterruptedException {
        long start  = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Demo task = new Demo(0L,10_0000_0000L);
        ForkJoinTask<Long> submit = forkJoinPool.submit(task);
        long aLong = submit.get();
        long end = System.currentTimeMillis();
        System.out.println("sum="+aLong+"时间2"+(end - start));
    }
    public static void test03(){
        long start  = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println("sum="+"时间"+(end - start));
    }
}
