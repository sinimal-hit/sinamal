package com.doer.saleTicket;


//基本的卖票例子


/**
 * 线程就是一个单独的资源类,没有任何的附属操作
 * 1,属性,方法
 */
public class SaleTicketDemo01 {
    public static void main(String[] args) {
        //并发,多线程操作同一个资源类,把资源类丢入线程
        Ticked ticked = new Ticked();

        //@FunctionalInterface 函数式接口,jdk1.8,  lambda表达式  (参数)->{代码}
        /*
        普通方式
        new Thread(new Runnable() {
            public void run() {

            }
        }).start();
         */

        //lambda方式
        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                synchronized (Ticked.class){
                    ticked.sale();
                }
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                synchronized (Ticked.class){
                    ticked.sale();
                }
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                synchronized (Ticked.class){
                    ticked.sale();
                }
            }
        },"C").start();
    }
}

//资源类
class Ticked{
    //属性,方法
    private int number = 50;

    //卖票的方式
    public  void sale(){
        if(number > 0){
            System.out.println(Thread.currentThread().getName()+"卖出了第"+(number--)+"张票,剩余: "+number);

        }
    }
}
