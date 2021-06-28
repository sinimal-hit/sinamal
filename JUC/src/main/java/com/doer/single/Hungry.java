package com.doer.single;

/**
 * 饿汉式单例模式
 * 一上来直接创建对象使用,可能会造成大量的资源浪费
 */
public class Hungry {
    private static final Hungry HUNGRY = new Hungry();
    private Hungry(){

    }
    public static Hungry getInstance(){
        return HUNGRY;
    }
}
