package real.java.thread;
/*
采用匿名内部类
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("分支线程--->" + i);
                }
            }
        });
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->" + i);
        }
    }
}
