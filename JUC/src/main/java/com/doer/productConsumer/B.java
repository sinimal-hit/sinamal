package com.doer.productConsumer;

/*
防止虚假唤醒
 */
public class B {
    public static void main(String[] args) {
        Data2 data2 = new Data2();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                try {
                    data2.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"生产者"+i).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                try {
                    data2.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"消费者"+i).start();
        }
    }
}
class Data2{
    private int num = 0;
    public synchronized void increment() throws InterruptedException {
        while (num!= 0){
            this.wait();
        }
        num++;
        System.out.println(Thread.currentThread().getName()+"-->"+num);
        this.notifyAll();
    }
    public synchronized void decrement() throws InterruptedException {
        while (num == 0){
            this.wait();
        }
        num--;
        System.out.println(Thread.currentThread().getName()+"-->"+num);
        this.notifyAll();
    }
}
