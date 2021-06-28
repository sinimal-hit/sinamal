package com.doer.productConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A执行完成之后调用A,B执行完成之后调用C,C执行完成之后调用A
 */
public class D {
    public static void main(String[] args) {
        Data4 data4 = new Data4();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data4.printA();
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data4.printB();
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data4.printC();
            }
        },"C").start();
    }
}
class Data4{
    private int num = 1;
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    public void printA(){
        lock.lock();
        try {
             //业务 判断->执行->通知
            while (num!=1){
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName()+"-->AAAAA");
            //通过监视器唤醒指定的线程
            num=2;
            condition2.signal();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void printB(){
        lock.lock();
        try {
            //业务 判断->执行->通知
            while (num!=2){
                condition2.await();
            }
            System.out.println(Thread.currentThread().getName()+"-->AAAAA");
            //通过监视器唤醒指定的线程
            num=3;
            condition3.signal();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void printC(){
        lock.lock();
        try {
            //业务 判断->执行->通知
            while (num!=3){
                condition3.await();
            }
            System.out.println(Thread.currentThread().getName()+"-->AAAAA");
            //通过监视器唤醒指定的线程
            num=1;
            condition1.signal();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    };
}
