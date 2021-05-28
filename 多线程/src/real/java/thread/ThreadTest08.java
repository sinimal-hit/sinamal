package real.java.thread;
/*
在java中如何让强行终止一个线程?
    这种方式存在很大的缺点:容易丢失数据,因为这种方式直接将线程直接杀死了
    线程中没有保存的数据将会丢失,不建议使用
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread04());
        t.setName("t");
        t.start();
        //模拟五秒睡眠
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //五秒之后强行终止t线程
        t.stop();//已过时,(不建议使用)
    }
}
class MyThread04 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
