package com.doer.lock8;

import java.util.concurrent.TimeUnit;

/*
5.增加两个静态的同步方法,只有一个对象,先打印 发短信还是打电话
    肯定是先发短信,因为一个类只有一把类锁,也就是只有一个类对象

6.两个对象,增加两个静态的同步方法,先打印 发短信还是打电话?
    还是发短信,因为两个对象的Class对象只有一个,所得是Class
 */
public class Test03 {
    public static void main(String[] args) {
        Phone3 phone3 = new Phone3();
        new Thread(()->{
            phone3.sendSms();
        },"A").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            phone3.call();
        },"B").start();
    }
}
class Phone3{
    //synchronized锁的对象是方法的调用者
    public static synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
    }
    public static synchronized void call(){
        System.out.println("打电话");
    }
    public void hello(){
        System.out.println("hello");
    }
}
