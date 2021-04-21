package exception;

public class MyExceptionTest01 {
    public static void main(String[] args) {
        //new了异常对象,但是没有抛出
        MyException e = new MyException("用户名不能为空");
        //打印异常堆栈信息
            e.printStackTrace();
        //获取异常简单描述信息
        System.out.println(e.getMessage());
    }
}
