package com.doer.single;

/**
 * 懒汉式
 * 单线程下ok 理想条件下这是个线程只创建一个线程
 * 多线程下有问题
 */
public class LazyMan {
    private LazyMan(){
        System.out.println(Thread.currentThread().getName()+"创建对象");
    }

    private static LazyMan lazyMan;

    public static LazyMan getInstance(){
        if(lazyMan == null){
            lazyMan = new LazyMan();
        }
        return lazyMan;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazyMan.getInstance();
            }).start();
        }
    }
}
