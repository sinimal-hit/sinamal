package com.doer.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * 求和计算的任务
 * 如何使用forkjoin
 * 1.forkjoinPool 通过它来执行
 * 2.计算任务 forkjoinPool.execute(ForkJoinTask<?> task)
 * 3.需要计算的类需要继承ForkJoinTask
 */
public class Demo extends RecursiveTask<Long> {
    private Long start;
    private Long end;

    public Demo(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    //临界值
    private Long temp = 10000L;


    public void test(){
        if((end - start)>temp){
            //分支合并计算
        }else {
            int sum = 0;
            for (int i = 1; i <= 10_0000_0000 ; i++) {
                sum+=i;
            }
            System.out.println(sum);
        }

    }

    @Override
    protected Long compute() {
        if((end - start) < temp){
            long sum = 0;
            for (Long i = start; i <= end ; i++) {
                sum+=i;
            }
            return sum;
        }else {
            //分支合并计算
            Long middle = (start + end)/2;
            Demo task1 = new Demo(start,middle);
            //差分任务,把任务压入线程队列
            task1.fork();
            Demo task2 = new Demo(middle+1,end);
            task2.fork();
            return task1.join()+task2.join();

        }
    }
}
