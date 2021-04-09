package exception;
/*
1,什么是异常?java提供异常机制有什么用?
    以下程序执行过程中发生不正常的情况,而这种不正常的情况叫做:异常
    java语言是很完善的语言,提供了异常的处理方式,以下程序窒息你个过程中出现了不正常的情况,
    java把该异常信息打印输出到控制台,供程序员参考,程序员看到异常信息之后,可以对程序进行修改,使得程序变得更加健壮


2,以下程序执行控制台出现了
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at exception.ExceptionTest01.main(ExceptionTest01.java:10)
    这个信息被我们称为:异常信息,这个信息是JVM打印的
 */
public class ExceptionTest01  {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //实际上,JVM在执行到此处的时候,会出现new异常对象: Exception in thread "main" java.lang.ArithmeticException: / by zero
        //并且JVM将new异常抛出,打印输出信息到控制台了
        try{
            int c = a/b;
            System.out.println(a + "/" + b +" = " + c);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
