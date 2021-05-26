package real.java.thread;

import sun.font.TextRecord;

/*
1, 怎么获取当前线程对象
    静态方法
    Thread t =  Thread.currentThread();  返回值t就是当前线程对象
2, 获取线程对象的名字

    String name = 线程对象.getName();
3, 修改线程对象的名字
    线程对象.setName()
4, 当线程没有设置名字的时候,默认的名字有什么规律
    Thread-0
    Thread-1
    Thread-2
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        //currentThread就是当前线程,这个方法出现在main方法当中,所以当前线程就是主线程
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName()); //main

        //创建线程对象1
        MyThread2 thread1 = new MyThread2();
        //默认线程名字
        System.out.println(thread1.getName());//Thread-0

        //设置线程名字
        thread1.setName("t1");

        //获取线程的名字
        System.out.println(thread1.getName());
        thread1.start();


        //创建线程对象2
        MyThread2 thread2 = new MyThread2();
        System.out.println(thread2.getName());//Thread-1
        thread2.setName("t2");
        thread2.start();
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 100 ;i++ ){

            //currentThread就是当前线程的对象,当thread1线程执行run方法,这个线程就是thread1
            //当thread2线程执行run方法,该线程就是thread2线程
            Thread currentThread = Thread.currentThread();

            System.out.println(currentThread.getName() +"-- >" + i);
            //System.out.println(super.getName()+"--->"+ i);
            //System.out.println(this.getName()+"--->"+ i);
        }
    }
}
