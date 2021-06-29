package com.doer.tvolatile;

/**
 * volatile不保证原子性
 */
public class Demo03 {
    private volatile static int num = 0;
    public static void main(String[] args) {
        //理论上num结果为20000
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    add();
                }
            }).start();
        }
        while (Thread.activeCount() > 2){
            Thread.yield();
        }
        //打印的值总是趋近于是20000
        System.out.println(Thread.currentThread().getName()+" "+num);
    }
    public  static void  add(){
        num++;
    }
}
