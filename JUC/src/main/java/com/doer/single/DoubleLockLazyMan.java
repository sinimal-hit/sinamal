package com.doer.single;

import com.doer.productConsumer.D;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 双重检验锁的懒汉模式 DCL懒汉式
 */
public class DoubleLockLazyMan {
    private volatile static DoubleLockLazyMan doubleLockLazyMan;
    private DoubleLockLazyMan(){
        System.out.println(Thread.currentThread().getName()+"创建ok");
    }
    public static DoubleLockLazyMan getInstance(){
        if(doubleLockLazyMan==null){
            synchronized (DoubleLockLazyMan.class){
                if(doubleLockLazyMan == null){
                    doubleLockLazyMan = new DoubleLockLazyMan();
                }
            }
        }
        return doubleLockLazyMan;
    }

    //反射破坏私有构造器
    public static void main(String[] args) throws Exception {
        //通过单例模式创建一个对象
        DoubleLockLazyMan doubleLockLazyMan = DoubleLockLazyMan.getInstance();

        //通过反射
        Constructor<DoubleLockLazyMan> declaredConstructor = DoubleLockLazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);//五十四有构造器
        DoubleLockLazyMan lockLazyMan = declaredConstructor.newInstance();
        System.out.println(doubleLockLazyMan.hashCode());
        System.out.println(lockLazyMan.hashCode());
    }
}
