package 最大公约数;

import java.util.Scanner;

public class Test {

    public static int MaxNumber(int m,int n){
        int number = Math.min(m,n);
        for (int i = number; i >= 1 ; i--) {
            if(m % i == 0 && n % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int m = scanner.nextInt();
        System.out.print("请输入第二个数：");
        int n = scanner.nextInt();
        System.out.println(MaxNumber(m,n));
    }
}
