package real.java.thread;
/*
sleep睡眠太久了,如果希望半道上醒来,应该怎么办?也就是怎么唤醒正在睡眠的线程
    不是终端线程,是终止线程的水碾
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        //希望五秒之后,t线程醒来
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //中断t线程的睡眠(这种中断睡眠的方式依靠了java的异常处理机制.)
        t.interrupt();//干扰,一盘冷水过去

    }
}
class MyRunnable2 implements Runnable{
    //run方法当中的异常不能throws,只能try.catch
    //因为run方法在父类当中没有抛出任何异常,子类不能比父类抛出更多的异常
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->" + "begin");
        //睡眠一年
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //一年之后才会执行这里.
        System.out.println(Thread.currentThread().getName() + "--->" + "end");
    }
}