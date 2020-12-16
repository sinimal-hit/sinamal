package 判定素数;

import java.util.Scanner;

/*
    给定一个数字，判定一个数字是否是素数
 */

public class TestPrime {
    public static boolean isPrime(int n){
        boolean flag = true;
        if(n <= 2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        for (int i = 3; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag =  isPrime(num);
        System.out.println(flag);

    }
}
