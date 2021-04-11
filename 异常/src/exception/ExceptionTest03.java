package exception;

public class ExceptionTest03 {
    //第一种处理异常的方式:在方法声明的位置继续使用throws,来完成异常的上抛,抛给调用者
    //上抛类似于推卸责任,(继续把异常传递给调用者)
    /*public static void main(String[] args) throws ClassNotFoundException {
        doSome();
    }*/



    //第二种处理方式,try..catch进行捕捉,捕捉相当于真正拦下了异常,调用者是不知道的.
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome~~~~");
    }
}
