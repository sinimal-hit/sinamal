package real.java.thread;
/*
让位:当前线程暂停,回到就绪状态
静态方法: Thread.yield();
 */
public class ThreadTest11 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable4());
        t.setName("t");
        t.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
class MyRunnable4 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            //每100个让位一次:
            if(i % 100 == 0){
                Thread.yield();//当前线程暂停一线
            }
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
