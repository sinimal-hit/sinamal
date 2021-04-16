package exception;
/*
finally语句
 */
public class ExceptionTest09 {
    public static void main(String[] args) {
        try{
            System.out.println("try.,.....");
            //退出JVM虚拟机
            System.exit(0);//退出JVM之后finally语句中的代码就不执行了
        }finally {
            System.out.println("finally.........");
        }

    }
}
