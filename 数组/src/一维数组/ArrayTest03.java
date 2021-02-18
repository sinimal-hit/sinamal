package 一维数组;
/*
    模拟一个系统.假设这个系统要使用,必须输入用户名和密码
 */
public class ArrayTest03 {
    //用户名和密码输入到String[] args当中
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("使用该系统请输入您该系统的用户名和密码,例如:zhangsan 123");
            return;
        }
        String username = args[0];
        String password = args[1];
        //if(username.equals("admin") && password.equals("123")){
        //这种形式可以避免空指针异常
        if("admin".equals(username) && "123".equals(password)){
            System.out.println("登陆成功,欢迎["+username+"]回来");
            System.out.println("您可以继续使用该系统...");
        }else {
            System.out.println("验证失败,用户名或者密码错误");

        }
    }
}
