package com.doer.saleTicket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicketDemo02 {
    public static void main(String[] args) {
        //并发,多线程操作同一个资源类,把资源类丢入线程
        Ticked2 ticked = new Ticked2();


    }
}

//Lock三部曲
/*
1.new ReenTrantLock();
2.lock.lock()枷锁
3.lock.unlock()解锁
 */
class Ticked2{
    //属性,方法
    private int number = 50;

    Lock lock = new ReentrantLock();
    //卖票的方式
    public  void sale(){
        lock.lock();
        try {
            if(number > 0){
                System.out.println(Thread.currentThread().getName()+"卖出了第"+(number--)+"张票,剩余: "+number);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

