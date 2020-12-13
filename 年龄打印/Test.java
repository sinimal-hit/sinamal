package 年龄打印;

import java.util.Scanner;

/*
    根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age <= 18){
            System.out.println("少年");
        }
        if(age > 19 && age <= 28){
            System.out.println("青年");
        }
        if(age > 29 && age <= 55){
            System.out.println("中年");
        }
        if(age > 56){
            System.out.println("老年");
        }

    }
}
