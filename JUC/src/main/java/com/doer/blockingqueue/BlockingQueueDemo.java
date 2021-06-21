package com.doer.blockingqueue;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueDemo {


    /*
    抛出异常
     */
    @Test
    public  void  test1(){
        //参数需要设置队列存放元素的大小
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(arrayBlockingQueue.add("a"));
        System.out.println(arrayBlockingQueue.add("b"));
        System.out.println(arrayBlockingQueue.add("c"));

        /*

        队列容量时4,超过队列容量的时候会抛出异常
        java.lang.IllegalStateException: Queue full
        System.out.println(arrayBlockingQueue.add("d"));

         */
        System.out.println("======================");
        System.out.println(arrayBlockingQueue.remove());
        System.out.println(arrayBlockingQueue.remove());
        System.out.println(arrayBlockingQueue.remove());

        //java.util.NoSuchElementException
        System.out.println(arrayBlockingQueue.remove());
    }

    /*
    不抛出异常
     */
    @Test
    public void test2(){
        ArrayBlockingQueue<Object> blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
        //不会抛出异常,队列满了添加元素不会抛出异常
        //System.out.println(blockingQueue.offer("d"));//false

        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());//null
    }

    /*
    等待,阻塞(一直阻塞)
     */
    @Test
    public void test03() throws InterruptedException {
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3);
        arrayBlockingQueue.put("a");
        arrayBlockingQueue.put("b");
        arrayBlockingQueue.put("c");

        //arrayBlockingQueue.put("d");//此时队列已经没有位置了,会一直等待
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());

        System.out.println(arrayBlockingQueue.take());//没有元素依然会阻塞

    }


    /*
    等待,阻塞(超时等待)
     */
    @Test
    public void test4() throws InterruptedException {
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3);
        arrayBlockingQueue.offer("a");
        arrayBlockingQueue.offer("b");
        arrayBlockingQueue.offer("c");

        //等待超时2s就退出
        //arrayBlockingQueue.offer("d",2, TimeUnit.SECONDS);
        System.out.println(arrayBlockingQueue.poll());
        System.out.println(arrayBlockingQueue.poll());
        System.out.println(arrayBlockingQueue.poll());

        //等待2s超时就推出
        System.out.println(arrayBlockingQueue.poll(2, TimeUnit.SECONDS));

    }
}
