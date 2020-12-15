package 打印X图形;

import java.util.Scanner;

public class Test {
    public static void print(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j||i+j == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if(input < 2 || input > 20){
                System.out.println("您的输入有误请重新输入");
                break;
            }
            print(input);
        }
    }
}
