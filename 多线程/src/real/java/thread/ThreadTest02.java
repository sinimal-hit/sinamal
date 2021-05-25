package real.java.thread;
/*
实现线程的第二种方式,编写一个类实现java.lang.Runnable接口
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //采用接口的方式实现多线程.
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->" + i);
        }
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        //编写程序,这端程序运行在分支栈中
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程--->" + i);
        }
    }
}

