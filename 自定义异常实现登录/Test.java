package 自定义异常实现登录;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/*
实现一个简单的控制台版用户登陆程序, 程序启动提示用户输入用户名密码. 如果用户名密码出错, 使用自定义异常的方式来处理
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入您的用户名");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("请输入您的密码");
        String password = scanner.nextLine();

        try {
            login(username,password);
        } catch (UserNameException e) {
            e.printStackTrace();
        } catch (PassWordException e) {
            e.printStackTrace();
        }


    }

    public static void login(String username, String password) throws UserNameException, PassWordException {
        if(username == null || password == null){
            System.out.println("用户名和密码不能为空,请您重新输入:");
        }
        if(!("admin".equals(username) )){
            throw new UserNameException("用户名输入错误");
        }
        if(!("123456".equals(password))){
            throw new PassWordException("密码输入错误");
        }
        System.out.println("登陆成功");
    }
}
