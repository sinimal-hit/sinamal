package real.java.thread;
/*
怎么合理的终止一个线程的执行
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        MyRunnable1 r = new MyRunnable1();
        Thread t = new Thread(r);

        t.setName("t");
        t.start();

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //终止线程
        //什么时候想终止线程的t的执行,只需要把标记修改为false就结束了
        r.run = false;
    }
}
class MyRunnable1 implements Runnable{
    //打一个boolean标记
    boolean run = true;
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            if(run){
                System.out.println(Thread.currentThread().getName() + "--->" +i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //return结束之前,可以把没有保存的信息在这里保存.
                //终止当前线程
                //save........
                return;
            }


        }
    }
}
