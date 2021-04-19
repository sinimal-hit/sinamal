package exception;
/*
final  finally finalize 有什么区别
    final是一个关键字,表示最终的,不变的.
        final修饰的类无法被继承
        final修饰的方法无法被覆盖
        final修饰的变量不能被重新赋值
    finally 关键字
        必须和try联合使用
        finally语句块中的代码是必须执行的
    finalize
        是Object类中的方法名
        这个方法有GC负责调用.
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        //final 表示最终的,不变的
        final int i = 200;

        //finally是也是一个关键字,但是必须和try联合使用,使用在异常处理机制中,
        //在finally语句块中的代码是一定会执行的.
        try{

        }finally{
            System.out.println("finally.....");
        }


        //finalize是一个标识符,是一个方法名.该方法时JVM中的GC垃圾回收器调用的.
        Object obj;
    }
}
