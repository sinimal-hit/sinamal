package real.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;//JUC包下的,属于java的并发包.

/*
实现线程的第三种方式:
    实现Callable接口
    这种方式的优点是:可以获取线程的返回值
    缺点是:效率比较低,在获取t线程执行结果的时候,当前线程受阻,效率较低
 */
public class ThreadTest14 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        //第一步,创建一个"未来任务类对象"
        //参数非常重要,需要给一个Callable接口实现类的对象.
        FutureTask<Object> task = new FutureTask<Object>(new Callable() {
            @Override
            public Object call() throws Exception {//call方法就相当于run方法,只不过这个有返回值.
                //线程执行一个任务,执行之后可能会有一个执行结果.
                //模拟执行
                System.out.println("call method begin");
                Thread.sleep(1000*10);
                System.out.println("call method end!");
                int a = 100;
                int b = 200;
                return a+b;
            }
        });

        //创建线程对象;
        Thread t = new Thread(task);

        //启动线程
        t.start();

        //这里是main方法,这是在主线程中.
        //在主线程中,怎么获取t线程的返回结果?
        //get方法的执行会导致"当前线程阻塞"
        Object obj = task.get();
        System.out.println("线程执行结果:"+ obj);

        //main方法这里的程序像执行必须等待get()方法的结束
        //而get()方法可能需要太久,因为get()方法是为了拿一个线程的执行结果.
        //另一个线程的执行是需要时间的.
        System.out.println("hello word");
    }
}
