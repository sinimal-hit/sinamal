package com.doer.lock8;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/*
8锁:就是关于锁的8个问题
    1.标准情况下,两个线程先打印: 发短信还是打电话
    2.sendSms方法延迟4s两个线程谁先打印?
        答案都是先发短信,synchronized锁的对象是方法的调用者,谁先拿到锁,谁先执行
 */
public class Test01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(()->{
            phone.sendSms();
        },"A").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            phone.call();
        },"B").start();
    }
}
class Phone{
    public synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("发短信");
    }
    public synchronized void call(){
        System.out.println("打电话");
    }
}
