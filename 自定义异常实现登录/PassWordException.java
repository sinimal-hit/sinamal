package 自定义异常实现登录;

public class PassWordException extends Throwable {
    public PassWordException(String s) {
        super(s);
    }
}
