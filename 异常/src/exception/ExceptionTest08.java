package exception;
/*
finally 语句
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        /*
        try和finally,没有catch是可以连用的.
        但是try是不能单独使用的.
         */
        /*
        以下代码的执行顺序:
            先执行try...
            在执行finally
            最后执行return(return语句只要执行方法必然结束)
         */
        try{
            System.out.println("try.,.....");
            return;
        }finally {
            System.out.println("finally.........");
        }
    }
}
