package com.doer.poll;

import java.util.concurrent.*;

public class Demo02 {
    public static void main(String[] args) {
        //获取CPU的核数
        System.out.println(Runtime.getRuntime().availableProcessors());
        //自定义线程池
        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                5,
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                // 第一种拒绝策略
                /**
                 * new ThreadPoolExecutor.AbortPolicy()
                 *   默认的拒绝策略 如果还有任务需要执行,不处理这个任务,抛出异常
                 *     new ThreadPoolExecutor.AbortPolicy()
                 *     这个类中如果创建了8个线程也就是线程池可以承载的最大的线程数量了,会正常执行,所有的线程
                 *     窗口都会执行,并且阻塞队列中也已经存储满了,接下来如果再加入一个线程会抛出一个异常
                 *     java.util.concurrent.RejectedExecutionException
                 */
                //第二种拒绝策略
                /**
                 * new ThreadPoolExecutor.CallerRunsPolicy()
                 *  哪里来的去哪里 也就是main线程执行
                 *  这里会执行  main  OK
                 *
                 */

                //第三种拒绝策略
                /**
                 *  new ThreadPoolExecutor.DiscardPolicy()
                 *  队列满了不会抛出异常 直接丢掉任务
                 */
               // new ThreadPoolExecutor.DiscardPolicy()

                //第四种拒绝策略
                /**
                 * new ThreadPoolExecutor.DiscardOldestPolicy()
                 * 队列满了,尝试去和最早的竞争线程资源,也不会抛出异常
                 */
                new ThreadPoolExecutor.DiscardOldestPolicy()


        );

        try {
            for (int i = 0; i < 9; i++) {
                //线程池最大承载的线程数量 Deque+max

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
