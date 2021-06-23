package com.doer.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //怎么启动Callable
        MyThread thread = new MyThread();
        FutureTask futureTask = new FutureTask(thread);
        new Thread(futureTask,"A").start();
        new Thread(futureTask,"B").start(); //启动两个线程 call方法只会执行一次,Callable本身存在缓存

        Integer integer = (Integer) futureTask.get();//获取callable的返回结果
        //这个get方法可能会产生阻塞,因为只有当线程执行完成之后才能获取返回值,或者使用异步处理
        System.out.println(integer);
    }
}
class MyThread implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("call()");
        return 1024;
    }
}