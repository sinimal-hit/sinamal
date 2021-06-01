package real.java.thread;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

/*
1,使用wait和notify方法实现"生产者和消费者模式"

2,什么是"生产者和消费者模式"?
    生产线程是负责生产,消费线程负责消费
    生产线程和消费线程达到均衡
    这是一种特殊的业务需求,在这种特殊的情况下需要使用wait方法和notify()方法

3,wait和notify方法不是线程对象的方法,是普通java对象都有的方法

4,wait和notify方法建立在线程同步的基础之上的,因为多线程要同时操作一个仓库,有线程安全问题

5.wait方法的作用:o.wait()让正在o对象上活动的线程t进入等待状态,并且释放之前o线程占有的o对象的锁

6,o.notify()方法的作用:o.notify()让正在o对象上等待的线程唤醒,只是通知,不会释放o对象之前占有的锁


 */
public class ThreadTest15 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Thread t1 = new Thread(new Product(list));
        Thread t2 = new Thread(new Consumer(list));
        t1.setName("生产者线程");
        t2.setName("消费者线程");

        t1.start();
        t2.start();
    }
}
//生产线程
class Product implements Runnable{
    private List list;
    public Product(List list){
        this.list = list;
    }
    @Override
    public void run() {
        //一直生产
        while(true){
            synchronized (list){
                if(list.size() > 0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            //程序运行到这里,说明仓库是空的,可以生产,
            Object obj = new Object();
            list.add(obj);
            System.out.println(Thread.currentThread().getName() + "--->" + obj );

            //唤醒消费者进行消费
            list.notify();
        }
    }
}
class Consumer implements Runnable{
    private List list;
    public Consumer(List list){
        this.list = list;
    }
    @Override
    public void run() {
        //一直消费
        while(true){
            synchronized (list){
                if(list.size() == 0){
                    try {
                        //仓库已经空了,
                        //消费者线程进入等待状态,释放list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序运行到这里,说明仓库有剩余,需要消费
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "--->"+obj);
                //唤醒生产者生产
                list.notify();
            }
        }
    }
}
