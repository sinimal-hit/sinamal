package real.java.thread;
/*
线程的sleep方法:
    static void sleep(long millis)
    1,静态方法,
    2,参数是毫秒
    3,作用:让当前线程进入休眠,进入"阻塞状态",放弃占有的CPU时间片,让给其他线程使用
        类似于出现在哪,就让该线程进入休眠
        这个方法出现在线程A中,线程A就进入休眠状态
        这个方法出现在线程B中,线程B就进入休眠状态

    4,Thread.sleep()可以做到:
        间隔特定的时间,去执行一段特定的代码,每个多久执行一次.
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000*5); //主线程进入休眠5 秒钟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //System.out.println("hello word");
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            //睡眠一秒;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
