package exception;
/*
java语言中异常是以什么形式存在呢?
    1,异常在java中是以类的形式存在的,每一个异常类都可以创建对象
    2,异常对应的
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        NullPointerException npe = new NullPointerException("发生空指针异常");
        System.out.println(npe);
    }
}
