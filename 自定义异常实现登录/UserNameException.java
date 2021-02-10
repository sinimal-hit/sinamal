package 自定义异常实现登录;

public class UserNameException extends Throwable {
    public UserNameException(String s) {
        super(s);
    }
}
