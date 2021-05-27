package real.java.thread;
/*
关于Thread.sleep()方法的面试题
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        //调用sleep方法
        try {
            //问题:这行代码会让主线程进入休眠状态吗?
            //不会.sleep()方法是静态方法,是让当前线程进入休眠,出现在main方法中,main方法会休眠
            t.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello word");
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0;i < 10000; i++){
            System.out.println(Thread.currentThread().getName() + "--->" +i);
        }
    }
}
