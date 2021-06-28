package com.doer.productConsumer;

/**
 * 线程之间的通信,生产者和消费者问题,等待唤醒,通知唤醒
 * 线程交替执行,A,B两个线程操作同一个资源 假如是变量 num = 0;
 * A num + 1
 * B num-1
 */

/*
注意这种方式会存在虚假唤醒
        if(number != 0){
            this.wait();
        }
   代码这里会存在一个问题,当线程多了之后,会出现与业务不符合的场景,
        A-->1
        D-->0
        B-->-1
        B-->-2
        B-->-3
   这种情况是时产生了虚假唤醒的情况产生导致的
   官方文档中这样解释:
        线程也可以唤醒，而不会被通知，中断或超时，即所谓的虚假唤醒 。
        虽然这在实践中很少会发生，但应用程序必须通过测试应该使线程被唤醒的条件来防范，
        并且如果条件不满足则继续等待。 换句话说，等待应该总是出现在循环中，
 */
public class A {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"D").start();

    }
}

//写生产者消费模式三个步骤 : 判断等待,业务,通知
class Data{
    //数字资源类
    private int number = 0;
    public synchronized void increment() throws InterruptedException {
        if(number != 0){
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName()+"-->"+number);
        this.notifyAll();
    }
    public synchronized void decrement() throws InterruptedException {
        if(number == 0){
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName()+"-->"+number);
        this.notifyAll();
    }
}
