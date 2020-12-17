package 输出一个整数的每一位;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int num = 1234;
        int bill = 1000;
        while(num != 0){
            System.out.print(num / bill);
            num = num % bill;
            bill = bill / 10;
        }

    }
}
