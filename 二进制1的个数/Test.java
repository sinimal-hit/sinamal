package 二进制1的个数;

import java.util.Scanner;

public class Test {
    public static int func(int n){
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if((n >> i & 1) == 1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(func(num));
    }
}
