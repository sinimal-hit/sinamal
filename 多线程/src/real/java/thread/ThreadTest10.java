package real.java.thread;
/*
关于线程的优先级
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        //设置主线程优先级:
        Thread.currentThread().setPriority(1);


//        System.out.println("线程最高优先级:" + Thread.MAX_PRIORITY);
//        System.out.println("线程最低优先级:" + Thread.MIN_PRIORITY);
//        System.out.println("线程最低优先级:" + Thread.NORM_PRIORITY);

        //获取当前线程对象,获取当前线程的优先级
        Thread currentThread = Thread.currentThread();
        //System.out.println(currentThread.getName() + "线程的默认优先级是:" + currentThread.getPriority());
        //main线程的默认优先级是:5

        Thread t = new Thread(new MyRunnable3());
        t.setPriority(10);
        t.setName("t");
        t.start();
        //优先级高的,只是抢到CPU时间片相对多一点
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }

    }
}
class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        //获取线程优先级
        //System.out.println(Thread.currentThread().getName() + "线程的默认优先级" +
                //Thread.currentThread().getPriority());
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" +i);
        }
    }
}
