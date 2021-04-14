package exception;
/*
   异常有两个非常重要的方法:
   String msg = exception.getMassage();    获取异常简单的描述信息
   exception.printStackTrace();             打印异常追踪的堆栈信息

   以后怎么查看异常的追踪信息来调试程序?
        异常追踪信息从上往下一行一行看,SUN写的程序就不需要看了(看包名就能看出程序是自己的还是SUN的,)
 */
public class ExceptionTest06 {
    public static void main(String[] args) {

        //这里只是new了异常对象,但是没有将异常对象抛出,JVM会认为这是一个普通的java对象
        NullPointerException e = new NullPointerException("空指针异常");
        String msg = e.getMessage();
        System.out.println(msg);//空指针异常
        System.out.println(new NullPointerException().getMessage());//null

        //打印异常堆栈信息,,这里打印会出现在前面,是因为线程的原因,
        //java后台在打印异常堆栈追踪信息的时候,采用了异步线程的方式打印的



        e.printStackTrace();
        System.out.println("Hello word");
    }
}

