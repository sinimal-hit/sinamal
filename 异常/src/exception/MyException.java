package exception;
/*
1.SUN提供的JDK内置异常肯定时不都使用的.在实际开发中,有很多业务,这些业务出现异常之后,JDK
    都是没有的,所以就需要程序员来自己定义异常类
2,java怎么定义异常呢
    两步:(死记硬背)
        第一步:编写一个类继承Exception或者RuntimeException
        第二步:提供两个构造方法,一个无参的,一个带有String参数的

 */
public class MyException extends Exception{
    public MyException(){

    }
    public MyException(String s){
        super(s);
    }
}

