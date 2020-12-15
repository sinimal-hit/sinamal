package 模拟登陆;

import java.util.Scanner;

/*
    模拟三次密码输入的场景。
    最多能输入三次密码，密码正确，提示“登录成功”,
    密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String password = "001113";
        while (count < 3){
            String yourPassword = scanner.nextLine();
            if(yourPassword.equals(password)){
                System.out.println("登陆成功");
                break;
            }
            else{
                count++;
                System.out.println("密码错误，一共三次机会，您已使用"+count+"次机会");
            }
        }
    }
}
