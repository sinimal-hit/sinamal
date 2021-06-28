package com.doer.lock8;

import java.util.concurrent.TimeUnit;
/*
增加了一个普通方法,先执行发短信还是先执行hello?
    注意这里的sendSms方法sleep了4秒,
    答案是hello因为hello方法没有枷锁
 */
public class Test02 {
    public static void main(String[] args) {
        Phone2 phone2 = new Phone2();
        new Thread(()->{
            phone2.sendSms();
        },"A").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            phone2.hello();
        },"B").start();
    }
}
class Phone2{
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
    public void hello(){
        System.out.println("hello");
    }
}
