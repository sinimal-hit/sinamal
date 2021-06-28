package com.doer.lock8;

import java.util.concurrent.TimeUnit;

/*
6.一个静态同步方法,一个普通的同步方法,一个对象,先打印 发短信还是打电话?
    打电话,因为有两把锁,一把是Class对象的锁,一把是Phone的锁,sendSms方法会睡眠4秒
 */
public class Test04 {
    public static void main(String[] args) {
        Phone4 phone4 = new Phone4();
        new Thread(()->{
            phone4.sendSms();
        },"A").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            phone4.call();
        },"B").start();
    }
}
class Phone4{
    //synchronized锁的对象是方法的调用者
    //静态同步方法 锁的是CLass对象
    public static synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
    }
    //普通的同步方法 锁的对象是方法的调用者
    public  synchronized void call(){
        System.out.println("打电话");
    }
    public void hello(){
        System.out.println("hello");
    }
}
