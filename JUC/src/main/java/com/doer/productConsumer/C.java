package com.doer.productConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C {
    public static void main(String[] args) {
        Data3 data3 = new Data3();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                for (int j = 0; j< 10;j++) {
                    try {
                        data3.increment();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"生产者"+i).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                for (int j = 0; j< 10;j++) {
                    try {
                        data3.decrement();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"消费者"+i).start();
        }
    }
}
class Data3{
    private int num = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void increment() throws InterruptedException {
        lock.lock();
        try {
            while (num != 0){
                condition.await();
            }
            num++;
            System.out.println(Thread.currentThread().getName()+"-->"+num);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void decrement() throws InterruptedException{
        lock.lock();
        try {
            while (num == 0){
                condition.await();
            }
            num--;
            System.out.println(Thread.currentThread().getName()+"-->"+num);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
