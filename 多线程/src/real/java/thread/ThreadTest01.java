package real.java.thread;
/*
实现线程的第一种方式
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        //main方法,这里的代码属于主线程,在主栈中运行
        MyThread myThread = new MyThread();

        //启动线程
        //start方法的作用是在JVM中开辟一个新的栈空间,启动一个分支线程,这段代码任务完成之后,瞬间就结束了
        //这段代码的任务只是为了开启一个新的栈空间,只要新的栈空间出来,start()方法就结束了.线程就启动成功了
        //启动成功的线程会自动调用run方法,并且run方法在分支栈的栈底部(压栈)
        //run方法在分支栈的地步,main方法在主栈的栈底部,run和main是评级的.
        myThread.start();

        //这里的代码还是运行在主线程中
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->" + i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        //编写程序,这端程序运行在分支栈中
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程--->" + i);
        }
    }
}
