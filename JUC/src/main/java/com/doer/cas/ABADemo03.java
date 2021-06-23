package com.doer.cas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

public class ABADemo03 {
    public static void main(String[] args) {
        //两个参数分别为初始值,和时间戳,相当于数据库中的添加的版本号保证在时间戳存在下每一次更改的值不重复,
        AtomicStampedReference<Integer> atomicInteger = new AtomicStampedReference<>(1,1);
        new Thread(()->{
            int stamp = atomicInteger.getStamp();//获得版本号
            System.out.println("a1 => "+stamp);

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            atomicInteger.compareAndSet(1,2,atomicInteger.getStamp(),
                    atomicInteger.getStamp()+1);
            System.out.println("a2=>"+stamp);
            atomicInteger.compareAndSet(2,1,atomicInteger.getStamp(),
                    atomicInteger.getStamp()+1);
            System.out.println("a3=>"+stamp);

        },"A").start();
        new Thread(()->{
            int stamp = atomicInteger.getStamp();//获得版本号
            System.out.println("b1 => "+stamp);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            atomicInteger.compareAndSet(1,6,stamp,stamp+1);
            System.out.println("b1=>"+atomicInteger.getStamp());
        },"B").start();
    }
}
